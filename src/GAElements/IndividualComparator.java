package GAElements;

import GAElements.Individual;

import java.util.Comparator;
/**
 * The class {@code IndividualComparator} is used to sort population array.
 */
public class IndividualComparator implements Comparator<Individual> {
    /**
     * The method {@code compare} has parameters individual a and individual b
     * {@return a.fitnessScore - b.fitnessScore}
     */
    public int compare(Individual a, Individual b) {
        return a.fitnessScore - b.fitnessScore;
    }
}
