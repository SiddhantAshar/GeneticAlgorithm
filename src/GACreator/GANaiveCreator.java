package GACreator;

import GAOperatorFactory.GANaiveOperatorFactory;
import GAMain.GeneticAlgorithm;
/**
 *
 * The class {@code GANaiveCreator} will use naive operator factory to create and return a GeneticAlgorithm object.
 *
 */

public class GANaiveCreator extends GACreator {

    /**
     *
     * The class {@code createGeneticAlgorithm} will create and return a new GeneticAlgorithm object using the
     * GANaiveOperatorFactory (Elite Selection, Alternate Crossover, Random Mutation)
     *
     */

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactoryObject = new GANaiveOperatorFactory();
        return new GeneticAlgorithm(operatorFactoryObject);
    }
}
