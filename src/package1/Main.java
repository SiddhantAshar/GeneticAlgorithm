package package1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		GeneticAlgorithm ga = GeneticAlgorithm.getInstance(
//				population size
//				population initialization method
//				Selection method
			);

		Population p = new Population();
		p.generateRandomPopulation(10);


		Fitness.calculateFitness(p);

		int generation = 1;
		while(generation <= 10) {

			Individual[] parents = selection(p);

			Individual[] children = crossover(parents);

			Individual[] mutatedChildren = mutate(children);

			for (Individual i: mutatedChildren) {
				int fitness = Fitness.calculateFitness(i);
				if (fitness == 100){
					System.out.println(i);
					return;
				}
			}

			p.kill(mutatedChildren.length);

			p.add(mutatedChildren);

			generation++;
		}
	}

	public static Individual[] selection(Population aPopulation){

		ArrayList<Integer> selectedParentsIndex = new ArrayList<>();
		Individual[] selectedParents = new Individual[4];

		int i=0;
		int candidateParentIndex = -1;
		while(i<4) {
			candidateParentIndex = (int)(Math.random()*10);
			if(selectedParentsIndex.indexOf(candidateParentIndex) != -1) {
				selectedParents[i] = aPopulation.population.get(i);
				i++;
			}
		}

		return selectedParents;
	}

	public static Individual[] crossover(Individual[] theParents){

		Individual[] children = new Individual[4];

		for(int i=0; i<3; i++) {
			int a1 = theParents[i].chromosome[0];
			int a2 = theParents[i+2].chromosome[0];
			int b1 = theParents[i+2].chromosome[1];
			int b2 = theParents[i].chromosome[1];
			int c1 = theParents[i].chromosome[2];
			int c2 = theParents[i+2].chromosome[2];
			int d1 = theParents[i+2].chromosome[3];
			int d2 = theParents[i].chromosome[3];


			children[i] = new Individual(a1, b1, c1, d1);
			children[i+2] = new Individual(a2,b2,c2,d2);

		}

		return children;
	}

	public static Individual[] mutate(Individual[] theChildren){
		return null;
	}

}


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