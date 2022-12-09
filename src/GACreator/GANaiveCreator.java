package GACreator;

import GAOperatorFactory.GANaiveOperatorFactory;
import GAMain.GeneticAlgorithm;


public class GANaiveCreator extends GACreator {

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactoryObject = new GANaiveOperatorFactory();
        return new GeneticAlgorithm(operatorFactoryObject);
    }
}
