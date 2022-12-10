package GACreator;

import GAMain.GeneticAlgorithm;
import GAOperatorFactory.GAOptimisedFactory;


public class GAOptimisedCreator extends GACreator {

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactoryObject = new GAOptimisedFactory();
        return new GeneticAlgorithm(operatorFactoryObject);
    }
}
