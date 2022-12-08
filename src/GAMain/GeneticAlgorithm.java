package GAMain;

import GAElements.Individual;
import GAElements.Population;
import GAOperatorFactory.GAOperatorFactory;

public class GeneticAlgorithm {
    GAOperatorFactory operatorFactory;
    Individual[] parents;
    Individual [] children;
    Individual [] mutatedChildren;

    public GeneticAlgorithm(GAOperatorFactory aOperatorFactory){
        this.operatorFactory = aOperatorFactory;
    }

    public void getNextGeneration(Population aPopulation){
        parents = operatorFactory.selectParents(aPopulation);
        children = operatorFactory.getChildren(parents);
        mutatedChildren = operatorFactory.mutate(children);
        aPopulation.kill(mutatedChildren.length);
        aPopulation.add(mutatedChildren);
    };


}
