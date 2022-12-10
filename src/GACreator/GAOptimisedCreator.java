package GACreator;

import GAMain.GeneticAlgorithm;
import GAOperatorFactory.GAOptimisedOperatorFactory;


public class GAOptimisedCreator extends GACreator {

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactoryObject = new GAOptimisedOperatorFactory();
        return new GeneticAlgorithm(operatorFactoryObject);
    }
}
