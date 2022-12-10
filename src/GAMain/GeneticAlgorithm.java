package GAMain;

import CrossoverOperators.ICrossover;
import GAElements.Fitness;
import GAElements.Individual;
import GAElements.IndividualComparator;
import GAElements.Population;
import GAOperatorFactory.IGAOperatorFactory;
import MutatationOperators.IMutation;
import SelectionOperators.ISelection;
/**
 * The class @code GeneticAlgorithm contains method for generating next generation of individuals
 *
 */

public class GeneticAlgorithm {
    Individual[] parents;
    Individual [] children;
    Individual [] mutatedChildren;
    ISelection selectionOperator;
    IMutation mutationOperator;
    ICrossover crossoverOperator;
    
    boolean stopAlgorithm = false;
    /**
     * GeneticAlgorithm is a parameterized constructor
     * @param aOperatorFactory is the object of interface IGAOperatorFactory
     * Here, Selection, Crossover and Mutation operators are selected for each respective operations
     *
     */
    public GeneticAlgorithm(IGAOperatorFactory aOperatorFactory){
        selectionOperator = aOperatorFactory.getSelectionOperator();
        crossoverOperator = aOperatorFactory.getCrossoverOperator();
        mutationOperator = aOperatorFactory.getMutationOperator();
    }

    /**
     * @param aPopulation is the object of class Population which is accepted by the method generateNextGeneration
     * The parents from the existing population are selected depending on the required selection operator
     * Crossover of the parents is done depending on the required crossover operator to get the children
     * Mutate operation is done depending on the required crossover operator and the children and mutated
     * Mutated children are removed from the population using kill function and then the least mutated children is added to the population
     * for the calculation of fitness score
     * If the fitness score is 0, then the perfect solution.
     */
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
