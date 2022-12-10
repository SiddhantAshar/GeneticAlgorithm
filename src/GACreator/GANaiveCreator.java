package GACreator;

import GAOperatorFactory.GANaiveOperatorFactory;
import GAMain.GeneticAlgorithm;
/**
 * The class {@code GANaiveCreator} calls createGeneticAlgorithm and creates new object operatorFactoryObject for class
 * GACreator which stores GANaiveOperatorFactory.
 *
 */

public class GANaiveCreator extends GACreator {

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactoryObject = new GANaiveOperatorFactory();
        return new GeneticAlgorithm(operatorFactoryObject);
    }
}
