package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Models an individual in a population.
 */
public class TestSuite {
    private ArrayList<String> testCases = new ArrayList<>();
    private String[] mvnCommand;
    private static ArrayList<String> masterListTestCases = new ArrayList<>();
    private int size;
    private Random numGenerator;
    private int covgPercentage = 0;
    private String project;
    private int tsID;
    private String covgFile;
    private Pattern ignoreTestStatsLines;
    private String os;
    private int generationNum;

    public TestSuite(int tsID, int size, String project, int generationNum) {
        this.tsID = tsID;
        this.size = size;
        this.project = project;
        this.generationNum = generationNum;

        if (masterListTestCases.isEmpty()) {
            genTestNames();
        }
        numGenerator = new Random();
        genTestSuite();
        createMVNCommand();
        ignoreTestStatsLines = Pattern.compile(".*(Main|GROUP).*");
    }

    private void genTestSuite() {
        for (int i = 0; i < size; i++) {
            int index = numGenerator.nextInt(100);
            String testCase = masterListTestCases.get(index);
            testCases.add(testCase);
        }
    }

    private static void genTestNames() {
        String baseTestName = "test";
        String zero = "0";
        for (int i = 0; i < 100; i++){
            String currTestName = baseTestName;
            if (i == 0) {
                currTestName += zero + zero;
            } else {
                currTestName += zero;
            }
            currTestName += i+1;
            masterListTestCases.add(currTestName);
        }
    }

    /**
     * Create the command to generate coverage
     */
    private void createMVNCommand() {
        String testCasesFile = "-Dtest=RegressionTest#";
        String testCasesTargeted = testCasesFile;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                testCasesTargeted += "+" + testCases.get(i);
            } else {
                testCasesTargeted += testCases.get(i);
            }
        }
        os = System.getProperty("os.name");
        // Ensure test generation works on Windows and not
        if (os.contains("Windows")) {
            mvnCommand = new String[]{"mvn.cmd", "clean", "test", testCasesTargeted};
        }
        else {
            mvnCommand = new String[]{"mvn", "clean", "test", testCasesTargeted};
        }
    }

    public int getTestSuiteSize() {
        return size;
    }

    public String getIndividualTestCase(int index) {
        return testCases.get(index);
    }

    public void setIndividualTestCase(int index, String tc) {
        testCases.set(index, tc);
    }

    public int getGenerationNum() {
        return generationNum;
    }

    private void genCoverageStats() {
        try {
            // Build and run the process
            ProcessBuilder builder = new ProcessBuilder(mvnCommand);
            //builder.inheritIO(); // Ensure thread isn't blocked on I/O
            builder.redirectErrorStream(true); // Mash error and stdout together
            builder = builder.directory(new File(project));
            Process process = builder.start();
            process.waitFor();
        } catch (IOException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        renameCoverageFile(tsID);
        //fixCSVEntries();
    }

    /**
     * Renames coverage file generated, then
     * copies it to directory holding coverage files.
     */
    private void renameCoverageFile(int testSetNumber) {
        String directory = "/CoverageReports/";
        String originalName = directory + "jacoco.csv";
        covgFile = project + directory + "testSet" + testSetNumber + ".csv";
        String[] renameFileAndMove;
        if (os.contains("Windows")) {
            renameFileAndMove = new String[]{"cmd.exe", "/c", "move \"" + project + originalName + "\"", "move \"" + project + covgFile + "\""};
        }
        else {
            renameFileAndMove = new String[]{"mv", project + originalName, covgFile};
        }
        try {
            // Rename coverage file and move to right directory
            ProcessBuilder builder = new ProcessBuilder(renameFileAndMove);
            //builder.inheritIO(); // Ensure thread isn't blocked on I/O
            builder.redirectErrorStream(true); // Mash error and stdout together
            builder = builder.directory(new File(project));
            builder.redirectErrorStream(true);
            Process process = builder.start();
            process.waitFor();
        } catch (IOException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    /**
     * Remove main class which is untested and adds
     * column to indicate number of test cases.
     *
     * Code adapted from example code here:
     * https://www.baeldung.com/apache-commons-csv
     */
    private void fixCSVEntries() {
        try {
            // Read file in to gather data.
            Reader in = new FileReader(covgFile);
            CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                    .build();
            Iterable<CSVRecord> records = csvFormat.parse(in);
            Matcher match;
            String[] HEADERS = null;

            Map<String, String> analyzedClass = null;
            for (CSVRecord record : records) {
                String stringRecord = record.toString();
                match = ignoreTestStatsLines.matcher(stringRecord);
                if (!match.matches()) {
                    analyzedClass = record.toMap();
                }
            }

            analyzedClass.put("TEST_CASES", String.valueOf(testCases.size()));
            HEADERS = (String[]) analyzedClass.keySet().toArray();
   
            // Write new file out with updated data.
            StringWriter sw = new StringWriter();
            csvFormat = CSVFormat.DEFAULT.builder()
                    .setHeader()
                    .build();
            try (final CSVPrinter printer = new CSVPrinter(sw, csvFormat)) {

                analyzedClass.forEach((k, v) -> {
                    try {
                        printer.printRecord(k, v);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Grabs instructions covered statistics from coverage file.
     */
    private void calcCovgPercent() {
        try {
            // read data from coverage file
            // Modified from example here: https://stackabuse.com/reading-and-writing-csvs-in-java/
            BufferedReader reader = new BufferedReader(new FileReader(covgFile));
            String row;
            int rowNum = 0;
            int instructionsMissed = 0, instructionsCovered = 0;
            while ((row = reader.readLine()) != null) {
                Matcher m = ignoreTestStatsLines.matcher(row);
                boolean match = m.matches();
                if (!match) {
                    String[] data = row.split(",");
                    // Instructions missed
                    instructionsMissed += Integer.parseInt(data[3]);
                    // Instructions covered
                    instructionsCovered += Integer.parseInt(data[4]);
                }
                rowNum++;
            }
            reader.close();
            covgPercentage = Math.round(100 * instructionsCovered / (instructionsCovered + instructionsMissed));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Calculates fitness based on coverage stats.
     * @return coverage percentage of instructions covered
     */
    public int getFitness() {
        if (covgPercentage == 0) {
            genCoverageStats();
            calcCovgPercent();
        }
       return covgPercentage;
    }

    @Override
    public String toString() {
        return "\nTest Suite ID: " + tsID + "\nCoverage Percentage: " + covgPercentage + "%\n\n" + testCases.toString();
    }
}
