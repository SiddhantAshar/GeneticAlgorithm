package GACreator;

import GAMain.GeneticAlgorithm;
import GAOperatorFactory.GARandomFactory;

public class GARandomCreator extends GACreator{

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactoryObject = new GARandomFactory();
        return new GeneticAlgorithm(operatorFactoryObject);
    }	
}
