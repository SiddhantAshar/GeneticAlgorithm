package GAMain;

import CrossoverOperators.ICrossover;
import GAElements.Individual;
import GAElements.Population;
//import GAOperatorFactory.GAOperatorFactory;
import GAOperatorFactory.IGAOperatorFactory;
import MutatationOperators.IMutation;
import SelectionOperators.ISelection;

public class GeneticAlgorithm {
//    GAOperatorFactory operatorFactory;
    Individual[] parents;
    Individual [] children;
    Individual [] mutatedChildren;
    ISelection selectionOperator;
    IMutation mutationOperator;
    ICrossover crossoverOperator;

    public GeneticAlgorithm(IGAOperatorFactory aOperatorFactory){
        selectionOperator = aOperatorFactory.getSelectionOperator();
        crossoverOperator = aOperatorFactory.getCrossoverOperator();
        mutationOperator = aOperatorFactory.getMutationOperator();
    }

    public void generateNextGeneration(Population aPopulation){
        parents = selectionOperator.selectParents(aPopulation);
        children = crossoverOperator.getChildren(parents);
        mutatedChildren = mutationOperator.mutate(children);
        aPopulation.kill(mutatedChildren.length);
        aPopulation.add(mutatedChildren);
    };


}