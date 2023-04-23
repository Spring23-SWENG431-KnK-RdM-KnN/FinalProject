import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptimizationTool
{
    public static void main(String[] args) {
        String project;
        JFileChooser jfc = new JFileChooser();

        jfc.setFileSelectionMode(1);

        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            project = jfc.getSelectedFile().getAbsolutePath();

            try {
                Process process = Runtime.getRuntime()
                        .exec("java -classpath " + project +
                                "/target/classes/:../randoop-4.3.2/randoop-all-4.3.2.jar randoop.main.Main gentests --classlist=" +
                                project + "/classestesting.txt --output-limit=100 --junit-output-dir=" +
                                project + "/TestCases/");

                printResults(process);

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void printResults(Process process) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    }
