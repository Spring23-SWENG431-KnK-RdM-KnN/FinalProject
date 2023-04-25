import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class OptimizationTool
{
    /**
     * GUI component variables
     */
    private String appName = "Genetic Optimization Tool";
    private JFrame guiFrame = new JFrame(appName);;
    private Container mainPane;
    private JPanel textPane;
    private JTextArea output;
    private JPanel buttonsArea;
    private JButton chooseProjectButton;
    private JButton jUnitTestsButton;
    private JButton geneticStartButton;
    /**
     * Code logic variables.
     */
    private Population testPop;
    private int tsSize = 60;
    private int popSize = 10;
    private int tournamentSize = popSize / 3;
    String project;
    private int minimumAcceptableCoverage = 90;
    private boolean hasMutated;

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
                    jUnitTestsButton.setEnabled(true);
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
                                        project + "/classestesting.txt --output-limit=500 --junit-output-dir=" +
                                        project + "/src/test/java/");
                        fixJUnitFileNames();
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
                        output.append("Running Genetic Test Generation\n");
                        TestSuite bestTS = runGeneticTestSuiteGeneration();
                        output.append("\n" + bestTS.toString());
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
    public void fixJUnitFileNames() {
        String originalFileName = "/RegressionTest0.java";
        String targetFileName = "/RegressionTest.java";
        String[] removeBadFile = {"rm", project+targetFileName};
        String[] renameFile = {"mv", project+originalFileName, project+targetFileName};
        try {
            // Remove JUnit 4 style runner class
            ProcessBuilder builder = new ProcessBuilder(removeBadFile);
            //builder.inheritIO(); // Ensure thread isn't blocked on I/O
            builder.redirectErrorStream(true); // Mash error and stdout together
            builder = builder.directory(new File(project));
            Process process = builder.start();
            printResults(process);

            // Rename to filename needed for test running.
            builder = new ProcessBuilder(renameFile);
            //builder.inheritIO(); // Ensure thread isn't blocked on I/O
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
    public void createInitialPopulation() {
        ArrayList<TestSuite> ats = new ArrayList<TestSuite>();
        for (int i = 0; i < popSize; i++) {
            TestSuite ts = new TestSuite(i, tsSize, project);
            ats.add(ts);
        }
        testPop = new Population(ats);
    }

    /**
     * Finds the best test suite based on coverage
     * percentage
     *
     * @return
     */
    public TestSuite runGeneticTestSuiteGeneration() {
        // Ensure we have a list of test cases
        if (testPop == null) {
            createInitialPopulation();
        }

        int generationCount = 0;
        while (testPop.getBestTestSuite().getFitness() < getMinCovg()) {
            System.out.println(
                    "Generation: " + generationCount
                            + " Coverage percentage: " + testPop.getBestTestSuite().getFitness());
            testPop = evolvePopulation(testPop);
            generationCount++;
        }

        TestSuite bestTs = testPop.getBestTestSuite();
        testPop = null;
        return bestTs;
    }

    /**
     * Create a new population of test suites
     * @param testPop population to evolve from
     * @return
     */
    private Population evolvePopulation(Population testPop) {
        Population evolvedPopulation = new Population(popSize);
        evolvedPopulation.addTestSuite(testPop.getBestTestSuite());
        try {
            // Name test cases to run
            for (int i = 1; i < popSize; i++) {
                // Start genetic processing by narrowing
                // down to 2 test suites to mutate
                TestSuite fittestTS1 = doTournament(testPop);
                TestSuite fittestTS2 = doTournament(testPop);
                // Cross-breed the two fittest test suites
                // to try to find a better test suite
                TestSuite newTS = doCrossover(i, fittestTS1, fittestTS2);
                evolvedPopulation.addTestSuite(newTS);
                if (i % 3 == 0) {
                    // Ensure 33% mutation
                    int mutationTsIndex = genRandomInt(0, evolvedPopulation.getPopulationSize()-1);
                    mutate(evolvedPopulation.getIndividualTestSuite(mutationTsIndex));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return evolvedPopulation;
    }


    /**
     * Performs tournament style selection of test suites to narrow
     * down optimization of test cases selected.
     *
     * Code is modified from example given here:
     * https://www.baeldung.com/java-genetic-algorithm
     */
    public TestSuite doTournament(Population testPop) {
        Population tournament = new Population(tournamentSize);
        for (int i = 0; i < tournamentSize; i++) {
            int randomId = (int) (Math.random() * testPop.getPopulationSize());
            tournament.addTestSuite(testPop.getIndividualTestSuite(randomId));
        }
        TestSuite bestTestSuite = tournament.getBestTestSuite();
        return bestTestSuite;
    }

    /**
     * Performs mutation of test suites
     * by cross-breeding them to test for
     * most efficient combination.
     *
     * Code is modified from example given here:
     * https://www.baeldung.com/java-genetic-algorithm
     */
    private TestSuite doCrossover(int tsID, TestSuite ts1, TestSuite ts2) {
        // Turn individual test cases
        // into binary digits to pick randomly
        // from.
        int pivot = genRandomInt(0, 100);
        TestSuite newSuite = new TestSuite(tsID, tsSize, project);
        for (int i = 0; i < tsSize; i++) {
            if (genRandomInt(0, 100) <= pivot) { // Take test case from first test suite
                newSuite.setIndividualTestCase(i, ts1.getIndividualTestCase(i));
            } else { // Take test case from second test suite
                newSuite.setIndividualTestCase(i, ts2.getIndividualTestCase(i));
            }
        }
        return newSuite;
    }

    /**
     * Randomly choose a test case from all possible
     * and insert it into a random test case
     * @param ts the test suite to mutate
     */
    public void mutate(TestSuite ts) {
        int pivot = genRandomInt(0, 100);
        boolean mutated = false;
        while (!mutated) {
            if (genRandomInt(0, 100) <= pivot) {
                // Get random test suite to get test case from
                TestSuite randomTs = testPop.getIndividualTestSuite(genRandomInt(0, testPop.getPopulationSize()-1));
                int i = genRandomInt(0, randomTs.getTestSuiteSize());
                // Grab random test case from random test suite
                String gene = randomTs.getIndividualTestCase(genRandomInt(0, randomTs.getTestSuiteSize()-1));
                // Insert random test case at random point in test suite
                ts.setIndividualTestCase(i, gene);
                mutated = true;
            }
        }
    }

    /**
     * Flexible generation of random integers
     * @param min smallest int value desired
     * @param max largest int value desired
     * @return
     */
    private int genRandomInt(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + 1)));
    }

    /**
     * Solution we want from algorithm.
     */
    public int getMinCovg() {
        return minimumAcceptableCoverage;
    }
}
