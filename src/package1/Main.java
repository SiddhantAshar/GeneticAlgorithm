package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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

			System.out.println("Generation: " + generation );

			Individual[] parents = selection(p);

			Individual[] children = crossover(parents);

//			Individual[] mutatedChildren = children;

//			for (Individual i: children) {
//				int fitness = Fitness.calculateFitness(i);
//				if (fitness == 0){
//					System.out.println(Arrays.toString(i.chromosome)+" "+i.fitnessScore);
//					return;
//				}
//			}

			p.kill(children.length);

			p.add(children);

			Fitness.calculateFitness(p);

			p.printPopulation();

			generation++;
			System.out.println("Population Fitness: " + p.populationFitness);
			System.out.println("--------------------------------------------------------");

		}
	System.out.println("END");
	}

	public static Individual[] selection(Population aPopulation){

		ArrayList<Integer> selectedParentsIndex = new ArrayList<>();
		Individual[] selectedParents = new Individual[4];

		// RANDOM SELECTION
		int i=0;
		int candidateParentIndex = -1;
		while(i<4) {
			candidateParentIndex = (int)(Math.random()*10);
			if(!selectedParentsIndex.contains(candidateParentIndex)) {
				selectedParents[i] = aPopulation.population.get(i);
				selectedParentsIndex.add(candidateParentIndex);
				i++;
			}
		}


//		//ELITE SELECTION
//		Collections.sort(aPopulation.population);


		return selectedParents;
	}

	public static Individual[] crossover(Individual[] theParents){

		Individual[] children = new Individual[4];

		for(int i=0; i<2; i++) {
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

//	public static Individual[] mutate(Individual[] theChildren){
//		return null;
//	}

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