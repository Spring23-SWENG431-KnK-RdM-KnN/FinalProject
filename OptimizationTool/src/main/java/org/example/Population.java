package org.example;

import java.util.ArrayList;

/**
 * Models a set of test suites.
 */
public class Population {
    private final ArrayList<TestSuite> pop;
    private int size;
    public Population(int size) {
        this.pop = new ArrayList<>();
    }
    public Population(ArrayList<TestSuite> pop) {
        this.pop = pop;
        this.size = pop.size();
    }
    public int getPopulationSize() {
        return pop.size();
    }
    public TestSuite getIndividualTestSuite(int index) {
        return pop.get(index);
    }
    public void addTestSuite(TestSuite ts) {
        pop.add(ts);
    }

    public TestSuite getBestTestSuite() {
        int tsId = 0, covgVal = 0;
        for (int i = 0; i < size; i++) {
            TestSuite currTs = pop.get(i);
            int currCovg = currTs.getFitness();
            if (currCovg > covgVal) {
                covgVal = currCovg;
                tsId = i;
            }
        }
        return pop.get(tsId);
    }
}
