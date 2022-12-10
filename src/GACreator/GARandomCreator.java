package GACreator;

import GAMain.GeneticAlgorithm;
import GAOperatorFactory.GARandomOperatorFactory;

/**
 *
 * The class {@code GANaiveCreator} will use random operator factory to create and return a GeneticAlgorithm object.
 *
 */

public class GARandomCreator extends GACreator{

    /**
     * The method {@code createGeneticAlgorithm} will create and return a new GeneticAlgorithm object using the
     * GARandomOperatorFactory (Random Selection, Random Crossover, Random Mutation)
     *
     */

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactoryObject = new GARandomOperatorFactory();
        return new GeneticAlgorithm(operatorFactoryObject);
    }	
}
