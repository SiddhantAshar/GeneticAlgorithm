package CrossoverOperators;

import GAElements.Individual;
/**
 * The interface {@code ICrossover} contains method for selecting parents
 *
 */
public interface ICrossover {
    public Individual[] getChildren(Individual[] theParents);
}
