import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptimizationTool
{
    private String appName = "Optimization Tool";
    private JFrame guiFrame = new JFrame(appName);;
    private Container mainPane;
    private JPanel textPane;
    private JTextArea output;
    private JPanel buttonsArea;
    private JButton chooseProjectButton;
    String project;


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
        // This part causes the app to:
        // 1. pop open a file selector where you need to select a folder
        // 2. Generates the Randoop tests in JUnit 4 format (no option to generate in JUnit 5 format)
        chooseProjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();

                jfc.setFileSelectionMode(1);

                if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    project = jfc.getSelectedFile().getAbsolutePath();

                    // Remove this part or comment it out if you don't want to re-generate
                    // Randoop JUnit 4 tests while testing additional functionality of GUI
                    try {
                        /*Process process = Runtime.getRuntime()
                                .exec("java -classpath " + project +
                                        "/target/classes/:../randoop-4.3.2/randoop-all-4.3.2.jar randoop.main.Main gentests --classlist=" +
                                        project + "/classestesting.txt --output-limit=200 --junit-output-dir=" +
                                        project + "/src/test/java/");

                        printResults(process);*/
                        createTestSets();
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }
            }
        });

        buttonsArea.add(chooseProjectButton);

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
     * Create and return sets of tests
     */
    /*public Method[][] createTestSets() {
        // Need to import the RegressionTest0 class from whichever project
        try {
            Process process = Runtime.getRuntime()
                    .exec("mvn clean test -Dtest=\"RegressionTest0#test001+test002+test003+test004+test005+test006+test007+test008+test009+test010\"");

            printResults(process);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        RegressionTest0 testSuite = new RegressionTest0();
        Class c = testSuite.getClass();
        Method tests[] = c.getDeclaredMethods();
        int sizeOfSets = tests.length / 10;
        Method[][] testSets = new Method[10][];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < sizeOfSets; j++) {
                testSets[i][j] = tests[i+j];
            }
        }
        return testSets;
    }*/

    /**
     * Void version of createTestSets for debugging purposes
     */
    public void createTestSets() {
        try {

            String[] command = {"mvn", "clean", "test", "-Dtest=RegressionTest#test001+test002+test003+test004+test005+test006+test007+test008+test009+test010"};
            String[] altcmd2 = {"mvn", "clean", "test", "-Dtest=RegressionTest"};
            String[] altcmd = {"mvn", "clean", "test"};
            ProcessBuilder builder = new ProcessBuilder(command);
            builder = builder.directory(new File(project));
            Process process = builder.start();

            printResults(process);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
