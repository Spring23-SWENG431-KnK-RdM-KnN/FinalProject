import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptimizationTool
{
    public static void main(String[] args) {
        String file;
        JFileChooser jfc = new JFileChooser();

        jfc.setFileSelectionMode(1);

        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            file = jfc.getSelectedFile().getAbsolutePath();

            try {
                Process process = Runtime.getRuntime()
                        .exec("java -classpath \"" + file + "\";%RANDOOP_JAR% randoop.main.Main gentests --testclass=TriangleDeterminer --output-limit=100 --junit-output-dir=\"C:\\Users\\GhostDuck\\Documents\\SWENG 431\\FinalProject\\Triangle\\src\\test\\java\"");

                printResults(process);

                String example = "java -Xmx3000m -classpath myclasspath:${RANDOOP_JAR} randoop.main.Main gentests --testclass=java.util.TreeSet --output-limit=100";

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
