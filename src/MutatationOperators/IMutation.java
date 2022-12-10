package MutatationOperators;

import GAElements.Individual;
/**
 * The interface @code IMutation contains method for mutation of children
 *
 */
public interface IMutation {
    /**
     * Implementation of mutate method is done in mutationRandom class
     *  @param theChildren object of class Individual.
     *
     */
    public Individual[] mutate(Individual [] theChildren);
}
