package GAElements;

import GAElements.Individual;
import GAElements.Population;
/**
 * The class {@code Fitness} has 4 variables a, b, c, d for
 *
 */
public class Fitness {

    static int RHS = 100;
    /**
     * The function {@code calculateFitness} contains logic for calculating the fitness of four variables of equation
     * 2*a+3*b-(c*c)+d = 100.
     * It calculates fitness of each individual.
     * {@param aIndividual}
     * @returns score(fitness) of every individual.
     *
     */
    public static int calculateFitness(Individual aIndividual){
        int a = aIndividual.chromosome[0];
        int b = aIndividual.chromosome[1];
        int c = aIndividual.chromosome[2];
        int d = aIndividual.chromosome[3];

        int LHS = 2*a+3*b-(c*c)+d;

        int score = Math.abs(RHS - LHS);

        aIndividual.setFitnessScore(score);

        return score;
    }
    /**
     * The function {@code calculateFitness} contains logic for calculating the fitness of Population.
     * If the Fitness is zero then the generation stops as we have found the fittest Individual.
     * Also it returns the total score of the generation
     * {@param aPopulation}
     * @returns score(fitness) of every population.
     *
     */

    public static int calculateFitness(Population aPopulation){
        int total = 0;
        for(Individual i: aPopulation.population){
            int s = calculateFitness(i);
            
            total += s;
        }
        total = total/aPopulation.population.size();
        aPopulation.setPopulationFitness(total);

        return total;
    }


}
