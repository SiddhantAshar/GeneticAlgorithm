package GACreator;

import GAMain.GeneticAlgorithm;
import GAOperatorFactory.GAOptimisedOperatorFactory;


/**
 *
 * The class {@code GANaiveCreator} will use optimised operator factory to create and return a GeneticAlgorithm object.
 *
 */


public class GAOptimisedCreator extends GACreator {

    /**
     * The class {@code createGeneticAlgorithm} will create and return a new GeneticAlgorithm object using the
     * GAOptimisedOperatorFactory (Tournament Selection, Single Point Crossover, Random Mutation)
     *
     */

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactoryObject = new GAOptimisedOperatorFactory();
        return new GeneticAlgorithm(operatorFactoryObject);
    }
}
