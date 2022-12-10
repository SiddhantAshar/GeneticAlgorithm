package GAMain;

import CrossoverOperators.ICrossover;
import GAElements.Fitness;
import GAElements.Individual;
import GAElements.IndividualComparator;
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
    
    boolean stopAlgorithm = false;

    public GeneticAlgorithm(IGAOperatorFactory aOperatorFactory){
        selectionOperator = aOperatorFactory.getSelectionOperator();
        crossoverOperator = aOperatorFactory.getCrossoverOperator();
        mutationOperator = aOperatorFactory.getMutationOperator();
    }

    public void generateNextGeneration(Population aPopulation){
    	
    	if(aPopulation.getPopulationFitness() == -1) {
    		Fitness.calculateFitness(aPopulation);
    	}
    	
        parents = selectionOperator.selectParents(aPopulation);
        
//        System.out.println("** Parents:");
//        for (int i=0; i<parents.length; i++) {
//        	System.out.println(parents[i]);
//        }
//        System.out.println("**");
        
        children = crossoverOperator.getChildren(parents);
        mutatedChildren = mutationOperator.mutate(children);
        
//        System.out.println("** Children:");
//        for (int i=0; i<mutatedChildren.length; i++) {
//        	System.out.println(mutatedChildren[i]);
//        }
//        System.out.println("**");
        
        aPopulation.kill(mutatedChildren.length);
        aPopulation.add(mutatedChildren);
        Fitness.calculateFitness(aPopulation); //calculate fitness after replacement for new generation
        aPopulation.getPopulation().sort(new IndividualComparator());

        if(aPopulation.getPopulation().get(0).getFitnessScore() == 0) {
        	stopAlgorithm = true;
        }
        
    };

}
