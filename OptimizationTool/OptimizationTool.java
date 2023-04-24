import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptimizationTool
{
    private String appName = "Genetic Optimization Tool";
    private JFrame guiFrame = new JFrame(appName);;
    private Container mainPane;
    private JPanel textPane;
    private JTextArea output;
    private JPanel buttonsArea;
    private JButton chooseProjectButton;
    private JButton jUnitTestsButton;
    private JButton geneticStartButton;
    String project;
    String[][] projectTestcases;
    Map<String, Map> tournamentResults;

    /**
     * Pattern taken from: https://www.tutorialspoint.com/how-to-add-action-listener-to-jbutton-in-java
     * @param args
     */
    public static void main(String[] args) {
        OptimizationTool tool = new OptimizationTool();
        tool.displayGUI();
    }

    private void buildComponents() {
        mainPane = guiFrame.getContentPane();
        textPane = new JPanel();
        textPane.setLayout(new BoxLayout(textPane, BoxLayout.PAGE_AXIS));
        buttonsArea = new JPanel();
        buttonsArea.setLayout(new BoxLayout(buttonsArea, BoxLayout.LINE_AXIS));

        chooseProjectButton = new JButton("Choose Project");
        chooseProjectButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        chooseProjectButton.setMinimumSize(new Dimension(76, 42));

        jUnitTestsButton = new JButton("Gen JUnit4 Tests");
        jUnitTestsButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        jUnitTestsButton.setMinimumSize(new Dimension(76, 42));
        jUnitTestsButton.setEnabled(false);

        geneticStartButton = new JButton("Start Genetic Test Creation");
        geneticStartButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        geneticStartButton.setMinimumSize(new Dimension(76, 42));
        geneticStartButton.setEnabled(false);
        /**
         * Only selects the project to run tests from
         */
        chooseProjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(1);
                if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    project = jfc.getSelectedFile().getAbsolutePath();
                }
                if (project != null) {
                    jUnitTestsButton.setEnabled(true);
                }
                File f = new File(project+"/src/test/java/RegressionTest.java");
                if(f.exists()) {
                    jUnitTestsButton.setEnabled(false);
                    geneticStartButton.setEnabled(true);
                }
            }
        });

        /** Creates JUnit 4 style tests using Randoop
         */
        jUnitTestsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (project != null) {
                    try {
                        Process process = Runtime.getRuntime()
                                .exec("java -classpath " + project +
                                        "/target/classes/:../randoop-4.3.2/randoop-all-4.3.2.jar randoop.main.Main gentests --classlist=" +
                                        project + "/classestesting.txt --output-limit=200 --junit-output-dir=" +
                                        project + "/src/test/java/");
                        fixFileNames();
                        geneticStartButton.setEnabled(true);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else {
                    output.append("\nChoose a project first.");
                }
            }
        });

        geneticStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (project != null) {
                    try {
                        runTestSets();
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else {
                    output.append("\nChoose a project first.");
                }
            }
        });

        buttonsArea.add(chooseProjectButton);
        buttonsArea.add(jUnitTestsButton);
        buttonsArea.add(geneticStartButton);

        // Below is based on example code from:
        // https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/TextSamplerDemoProject/src/components/TextSamplerDemo.java
        //Create a text area.
        output = new JTextArea(
                "Results output:"
        );
        output.setFont(new Font("Segoe Script", Font.BOLD, 20));
        output.setLineWrap(true);
        output.setWrapStyleWord(true);
        output.setEditable(false);
        // Below code is based on post here:
        // https://tips4java.wordpress.com/2008/10/22/text-area-scrolling/
        // Auto-scroll to bottom of page output.
        output.setDoubleBuffered(true);
        output.setCaretPosition(output.getDocument().getLength());
        DefaultCaret caret = (DefaultCaret)output.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        // Add scroll
        JScrollPane scrollPane = new JScrollPane(output);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(250, 250));

        textPane.add(scrollPane);

        mainPane.add(buttonsArea, BorderLayout.PAGE_START);
        mainPane.add(textPane, BorderLayout.CENTER);
    }

    /**
     * Below is an altered version of GUI taken from
     * Oracle tutorial here: https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/start/HelloWorldSwingProject/src/start/HelloWorldSwing.java
     */
    private void displayGUI() {
        guiFrame.setPreferredSize(new Dimension(640, 640));
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildComponents();

        //Display the window.
        guiFrame.pack();
        guiFrame.setVisible(true);
    }

    public void printResults(Process process) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            output.append("\n" + line);
        }
    }

    /**
     * Fixes file naming for generated test files
     */
    public void fixFileNames() {
        String originalFileName = "RegressionTest0.java";
        String targetFileName = "RegressionTest.java";
        String[] removeBadFile = {"rm", project+targetFileName};
        String[] renameFile = {"mv", project+originalFileName, project+targetFileName};
        // Remove JUnit 4 style runner class
        ProcessBuilder builder = new ProcessBuilder(removeBadFile);
        builder.inheritIO(); // Ensure thread isn't blocked on I/O
        builder.redirectErrorStream(true); // Mash error and stdout together
        builder = builder.directory(new File(project));
        try {
            Process process = builder.start();
            printResults(process);
            // Rename to filename needed for test running.
            builder = new ProcessBuilder(renameFile);
            builder.inheritIO(); // Ensure thread isn't blocked on I/O
            builder.redirectErrorStream(true); // Mash error and stdout together
            builder = builder.directory(new File(project));
            process = builder.start();
            printResults(process);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /** Creates the set of tests to perform tournament
     * style genetic selection from.
     */
    public void createTestSets() {
        projectTestcases = new String[10][10];
        String baseTestName = "test";
        String zero = "0";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                String currTestName = baseTestName;
                if (i == 0) {
                    currTestName += zero + zero;
                    currTestName += j+1;
                } else {
                    currTestName += zero;
                    currTestName += i*10+j+1;
                }
                projectTestcases[i][j] = currTestName;
            }
        }
    }

    /**
     * Renames coverage file generated, then
     * copies it to directory holding coverage files.
     */
    private void renameCoverageFiles(int testSetNumber) throws Exception {
        String directory = "/CoverageReports/";
        String originalName = directory + "jacoco.csv";
        String baseTargetName = directory + "testSet" + testSetNumber + ".csv";
        String[] renameFileAndMove = {"mv", project+originalName, project+baseTargetName};
        // Rename coverage file and move to right directory
        ProcessBuilder builder = new ProcessBuilder(renameFileAndMove);
        builder.inheritIO(); // Ensure thread isn't blocked on I/O
        builder.redirectErrorStream(true); // Mash error and stdout together
        builder = builder.directory(new File(project));
        builder.redirectErrorStream(true);
        Process process = builder.start();
        process.waitFor();
        printResults(process);
    }

    /**
     * Runs tests in sets of 10 at a time
     */
    public void runTestSets() {
        // Ensure we have a list of test cases
        if (projectTestcases == null) {
            createTestSets();
        }

        String testCasesFile = "-Dtest=RegressionTest#";
        String testCasesTargeted;
        try {
            // Name test cases to run
            for (int i = 0; i < projectTestcases.length; i++) {
                testCasesTargeted = testCasesFile;
                for (int j = 0; j < projectTestcases[i].length; j++) {
                    if (j != 0) {
                        testCasesTargeted += "+" + projectTestcases[i][j];
                    } else {
                        testCasesTargeted += projectTestcases[i][j];
                    }
                }

                String[] runTests;
                String os = System.getProperty("os.name");
                // Ensure test generation works on Windows and not
                if (os.contains("Windows")) {
                    runTests = new String[]{"mvn.cmd", "clean", "test", testCasesTargeted};
                }
                else {
                    runTests = new String[]{"mvn", "clean", "test", testCasesTargeted};;
                }
                // Build and run the process
                ProcessBuilder builder = new ProcessBuilder(runTests);
                builder.inheritIO(); // Ensure thread isn't blocked on I/O
                builder.redirectErrorStream(true); // Mash error and stdout together
                builder = builder.directory(new File(project));
                Process process = builder.start();
                process.waitFor();
                printResults(process);

                renameCoverageFiles(i);

                // Start genetic processing by narrowing
                // down test suites to mutate
                doTournament();
                //
                doCrossover();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void storeRelevantCovgStats() {
        // Get number of files to analyze
        String covgDirName = project + "CoverageReports";
        File covgDir = new File(covgDirName);
        File[] covgFiles = covgDir.listFiles();

        // Store instruction and line coverage stats
        Map<String, Map> testSuiteResults = new HashMap<>();
        if (covgFiles.length > 0) {
            // Get coverage data for each test suite
            for (int i = 0; i < covgFiles.length; i++) {
                if (covgFiles[i].isFile()) {
                    try {
                        // read data from coverage file
                        // Modified from example here: https://stackabuse.com/reading-and-writing-csvs-in-java/
                        BufferedReader reader = new BufferedReader(new FileReader(covgFiles[i]));
                        String row;
                        Map<String, Integer> testSuiteData = new HashMap<>();
                        int rowNum = 0;
                        while ((row = reader.readLine()) != null) {
                            if (rowNum > 0) {
                                String[] data = row.split(",");
                                // Store line and block coverage numbers for comparison
                                // Instructions missed
                                testSuiteData.put("IMissed", Integer.parseInt(data[4]));
                                // Instructions covered
                                testSuiteData.put("ICovered", Integer.parseInt(data[5]));
                                // Lines missed
                                testSuiteData.put("LMissed", Integer.parseInt(data[8]));
                                // Lines covered
                                testSuiteData.put("LCovered", Integer.parseInt(data[9]));
                            }
                            testSuiteResults.put("testSuite" + i, testSuiteData);
                            rowNum++;
                        }
                        reader.close();
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }


    /**
     * Performs tournament style selection of test suites to narrow
     * down optimization of test cases selected.
     */
    public void doTournament() {
        storeRelevantCovgStats();




        // Compare coverage
        // Below is modified from example here: https://www.digitalocean.com/community/tutorials/sort-hashmap-by-value-java
        // Allows access of nested Map to sort by it's values
        Comparator<Map> byLineCoverage = Comparator.comparingInt((Map val) -> (Integer) val.get("LCovered"));
        // Sort top level map by nested map's values using comparator above
        tournamentResults =
                testSuiteResults.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(byLineCoverage))
                        // Below is adapted from an answer to this post:
                        // https://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values
                        .limit(4)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));
        }
    }


    /**
     * Performs mutation of test suites
     * by cross-breeding them to test for
     * most efficient combination.
     */
    private void doCrossover() {
        // Turn individual test cases
        // into binary digits
    }
}
