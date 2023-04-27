# Final Project

## Instructions on How to Use OptimizationTool
1. Open OptimizationTool.java under the OptimizationTool directory and run it
2. Click the "Choose Project" button
3. Find and open your desired Project folder
4. If JUnit tests do not exist yet, click "Gen JUnit4 Tests" button (Tests should already exist, so move on to Step 5)
   1. Once program outputs to GUI console saying that "RegressionTest0.java" and "RegressionTest.java" exist, close program
   2. Through Intellij, if only "RegressionTest.java" exists:
      1. Use the following link to convert "RegressionTest.java" from JUnit4 to JUnit5 (https://blog.jetbrains.com/idea/2020/08/migrating-from-junit-4-to-junit-5/#UsingInspectionstoMigrateAllTests)
      2. Redo Steps 1-3 and then move to Step 5
   3. Else if both "RegressionTest0.java" and "RegressionTest.java" exist:
      1. Delete "RegressionTest.java" which should have only a few lines of code
      2. Refactor -> Rename file... from "RegressionTest0.java" to "RegressionTest.java"
      3. Use the following link to convert "RegressionTest.java" from JUnit4 to JUnit5 (https://blog.jetbrains.com/idea/2020/08/migrating-from-junit-4-to-junit-5/#UsingInspectionstoMigrateAllTests)
      4. Redo Steps 1-3 and then move to Step 5
5. Select your desired values for the following values: "Test Cases/Suite", "Select Max Generation", "Select Minimum Coverage"
6. Click "Start Genetic Test Selection" button and then wait for output to appear

## File Structure
- Commission: computes the commission earned by salesman of locks, stocks, and barrels
- NextDate: given month, date, and year, returns the date of the day after the input date
- Triangle: java program computing the type of triangle based on side lengths.

> These 3 problems and their pseudocode can be viewed in Module 2 Part II on Canvas or the book "Software Testing", starting with the [Triangle problem](https://psu.instructure.com/courses/2243925/pages/m2-partii-dot-2-unit-testing-illustration-1-the-triangle-problem?module_item_id=37158618)
### To Do (33/33 complete):

- [X] Create Triangle program
- [X] Create NextDate program
- [X] Create Commission program
- [X] Install JUnit for test case and data generation
- [X] Install JaCoCo plugin for test coverage graph and metrics
- [X] Generate test cases using JUnit: Triangle
- [X] Generate test cases using JUnit: Commission
- [X] Generate test cases using JUnit: NextDate
- [X] Compute the coverage with JaCoCo Triangle
- [X] Compute the coverage with JaCoCo Commission
- [X] Compute the coverage with JaCoCo NextDate
- [X] Create Genetic Algorithm Fitness Function: Tournament
- [X] Create Genetic Algorithm Fitness Function: Crossover (breed)
- [X] Create tool to minimize test cases based on optimization algorithm
- [X] Create function to take in csv test cases and split them into sets
- [X] Run genetic algorithm to find best 2 sets and crossbreed them for best coverage
- [x] Apply the created tool to generate new test data and test cases for Triangle
- [X] Apply the created tool to generate new test data and test cases for Commission
- [X] Apply the created tool to generate new test data and test cases for NextDate
- [X] Execute generated test cases and calculate coverage
- [X] Use metrics to write report results
- [X] Create graph and figures to display results
- [X] Write Abstract 200-250 words
- [X] Write Introduction 1.5 - 2 pgs
- [X] Find 10-15 studies that are relevant to proposed method that software tool uses to minimize test cases
- [X] Write 1.5 - 2 pgs about the relevant studies
- [X] Write 2 - 5 pgs about the proposed method to improve testing. Includes tables and figures
- [X] Write 1 - 2 pgs to explain the experiment in pseudocode, the datasets used, projects used, and what is being investigated with the experiment
- [X] Write 2 - 5 pgs on results of experiment. Compare test cases and coverage before tool used and after
- [X] Write 5 - 8 benefits the tool has for community
- [X] Write 4 - 7 limitations of the experiment results
- [X] Write conclusion paragraph/section
- [X] List 15 - 20 relevant articles used in writing the report
