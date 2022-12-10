package GACreator;

import GAMain.GeneticAlgorithm;
import GAOperatorFactory.IGAOperatorFactory;
/**
 *
 * The class {@code GANaiveCreator} will use operator factory to create and return a GeneticAlgorithm object.
 *
 */
public abstract class GACreator {
    IGAOperatorFactory operatorFactoryObject;

    public abstract GeneticAlgorithm createGeneticAlgorithm();
}
