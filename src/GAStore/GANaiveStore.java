package GAStore;

import GAOperatorFactory.GANaiveOperatorFactory;
import GAMain.GeneticAlgorithm;


public class GANaiveStore extends GAStore {

    @Override
    public GeneticAlgorithm createGeneticAlgorithm() {
        operatorFactory = new GANaiveOperatorFactory();
        return new GeneticAlgorithm(operatorFactory);
    }
}
