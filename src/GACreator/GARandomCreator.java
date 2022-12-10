package GACreator;

import GAMain.GeneticAlgorithm;
import GAOperatorFactory.GARandomOperatorFactory;

public class GARandomCreator extends GACreator{

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactoryObject = new GARandomOperatorFactory();
        return new GeneticAlgorithm(operatorFactoryObject);
    }	
}
