package GAMain;

import CrossoverOperators.ICrossover;
import GAElements.Individual;
import GAElements.Population;
import GAOperatorFactory.IGAOperatorFactory;
import MutatationOperators.IMutation;
import SelectionOperators.ISelection;

public class GeneticAlgorithm {
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
        
//        System.out.println("** Parents:");
//        for (int i=0; i<parents.length; i++) {
//        	System.out.println(parents[i]);
//        }
        
        children = crossoverOperator.getChildren(parents);
        mutatedChildren = mutationOperator.mutate(children);
        
//        System.out.println("** Children:");
//        for (int i=0; i<mutatedChildren.length; i++) {
//        	System.out.println(mutatedChildren[i]);
//        }
        
        aPopulation.kill(mutatedChildren.length);
        aPopulation.add(mutatedChildren);
    };


}
