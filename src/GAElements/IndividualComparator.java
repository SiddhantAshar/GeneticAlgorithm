package GAElements;

import GAElements.Individual;

import java.util.Comparator;

public class IndividualComparator implements Comparator<Individual> {
    public int compare(Individual a, Individual b) {
        return a.fitnessScore - b.fitnessScore;
    }
}
