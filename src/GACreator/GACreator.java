package GACreator;

import GAMain.GeneticAlgorithm;
import GAOperatorFactory.IGAOperatorFactory;
/**
 * The abstract class {@code GACreator} contains object operatorFactoryObject which is used in GANaiveCreator
 *
 */
public abstract class GACreator {
    IGAOperatorFactory operatorFactoryObject;

    public abstract GeneticAlgorithm createGeneticAlgorithm();
}
