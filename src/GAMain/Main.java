package GAMain;


import GAElements.Individual;
import GAElements.Population;
import GACreator.GANaiveCreator;
import GACreator.GARandomCreator;
import GACreator.GAOptimisedCreator;
import GACreator.GACreator;

public class Main {

	public static void main(String[] args) {
		
		int generationThreshold = 100;

		Population population = Population.getInstance();

		population.generateRandomPopulation(20);
//		Fitness.calculateFitness(population);

		// GA NAIVE
//		GACreator gaNaiveCreator = new GANaiveCreator();
//		GeneticAlgorithm geneticAlgorithm = gaNaiveCreator.createGeneticAlgorithm();

		// GA OPTIMISED
		GACreator gaOptimisedCreator = new GAOptimisedCreator();
		GeneticAlgorithm geneticAlgorithm = gaOptimisedCreator.createGeneticAlgorithm();

		// GA RANDOM
//		GACreator gaRandomCreator = new GARandomCreator();
//		GeneticAlgorithm geneticAlgorithm = gaRandomCreator.createGeneticAlgorithm();

		int generation = 1;
		while (generation <= generationThreshold) {
			System.out.println("Generation: "+generation);
			geneticAlgorithm.generateNextGeneration(population);

			population.printPopulation();
			System.out.println("Population Fitness: " + population.populationFitness);
			System.out.println("--------------------------------------------------------");
 			if (geneticAlgorithm.stopAlgorithm)
				break;

			generation++;
		}
		
		System.out.println("=================== S O L U T I O N =====================");
		
		Individual fittestIndividual = population.population.get(0);
		if(fittestIndividual.getFitnessScore() == 0) {
			System.out.println("Perfect solution found.");
			System.out.println("Solution found at generation: " + generation);
		} else {
			System.out.println("Perfect solution not found.");
		}
		System.out.println("Fittest Individual: \n" + fittestIndividual);
		
		System.out.println("=========================================================");
		

	}

}



//		int generation = 1;
//		while (generation <= 100) {
//			System.out.println("Generation: " + generation );
//
//			Individual[] parents = selection(p);
//
//			System.out.println("Parents: ");
//			for (Individual i: parents) {
//				System.out.println(Arrays.toString(i.chromosome) + "Score: "+ i.fitnessScore);
//			}
//			Individual[] children = crossover(parents);
//
//			Individual[] mutatedChildren = mutate(children);
//
//			System.out.println("Mutated Children: ");
//			for (Individual i: children) {
//				System.out.println(Arrays.toString(i.chromosome));
//			}
//			p.kill(mutatedChildren.length);
//
//			p.add(mutatedChildren);
//
//			Fitness.calculateFitness(p);
//
//			System.out.println("Population: ");
//			p.printPopulation();
//
//			generation++;
//			System.out.println("Population Fitness: " + p.populationFitness);
//			System.out.println("--------------------------------------------------------");
//
//			if (p.stopGeneration)
//				return;
//
//		}
//	System.out.println("END");
//	}
//
//	public static Individual[] selection(Population aPopulation){
//
//		ArrayList<Integer> selectedParentsIndex = new ArrayList<>();
//		Individual[] selectedParents = new Individual[4];
//
//		// RANDOM SELECTION
////		int i=0;
////		int candidateParentIndex = -1;
////		while(i<4) {
////			candidateParentIndex = (int)(Math.random()*10);
////			if(!selectedParentsIndex.contains(candidateParentIndex)) {
////				selectedParents[i] = aPopulation.population.get(i);
////				selectedParentsIndex.add(candidateParentIndex);
////				i++;
////			}
////		}
//
//
//		//ELITE SELECTION
//		aPopulation.population.sort(new IndividualComparator());
//		for (int x=0; x<4; x++){
//			selectedParents[x] = aPopulation.population.get(x);
//		}
//
//
//
//		return selectedParents;
//	}
//
//	public static Individual[] crossover(Individual[] theParents){
//
//		Individual[] children = new Individual[4];
//
//		for(int i=0; i<2; i++) {
//			int a1 = theParents[i].chromosome[0];
//			int a2 = theParents[i+2].chromosome[0];
//			int b1 = theParents[i+2].chromosome[1];
//			int b2 = theParents[i].chromosome[1];
//			int c1 = theParents[i].chromosome[2];
//			int c2 = theParents[i+2].chromosome[2];
//			int d1 = theParents[i+2].chromosome[3];
//			int d2 = theParents[i].chromosome[3];
//
//
//			children[i] = new Individual(a1, b1, c1, d1);
//			children[i+2] = new Individual(a2,b2,c2,d2);
//
//		}
//
//		return children;
//	}
//
//
//	public static Individual[] mutate(Individual[] theChildren){
//		boolean ifMutate = (int) (Math.random()*10) <= 5;
//		if(ifMutate){
//			int childrenIndex = (int) (Math.random()*100) % theChildren.length;
//			int chromosomeIndex = (int) (Math.random()*100) % theChildren[childrenIndex].chromosome.length;
//			int value = (int) (Math.random()*100);
//			theChildren[childrenIndex].chromosome[chromosomeIndex] = value;
//		}
//
//		return theChildren;
//	}
//
//}
//
//
//class IndividualComparator implements Comparator<Individual>{
//	public int compare(Individual a, Individual b){
//		return a.fitnessScore - b.fitnessScore;
//	}
//
//}


/*
 * problem = solve 2 variable equation
 * 
 * Initialize Population --- initialization methods
 * Calculate Fitness ------- 
 * Selection --------------- selection methods (tournaments, random, roulette)
 * Crossover --------------- single point, two point, uniform
 * Mutate ------------------ 
 * 
 * https://towardsdatascience.com/genetic-algorithm-explained-step-by-step-65358abe2bf
 * 
 */