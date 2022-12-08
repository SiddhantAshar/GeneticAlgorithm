package GAStore;

import GAOperatorFactory.GAOperatorFactory;
import GAMain.GeneticAlgorithm;

public abstract class GAStore {
    GAOperatorFactory operatorFactory;

    public abstract GeneticAlgorithm createGeneticAlgorithm();
}
