package GACreator;

import GAMain.GeneticAlgorithm;
import GAOperatorFactory.IGAOperatorFactory;

public abstract class GACreator {
    IGAOperatorFactory operatorFactoryObject;

    public abstract GeneticAlgorithm createGeneticAlgorithm();
}
