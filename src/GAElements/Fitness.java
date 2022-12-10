package GAElements;

import GAElements.Individual;
import GAElements.Population;
/**
 * The class {@code Fitness} has calculateFitness methods to calculate fitness score for a Population or an Individual
 *
 */
public class Fitness {

    static int RHS = 100;
    /**
     * The function {@code calculateFitness} returns the fitness score of Individual by substituting Individual
     * chromosome elements [a, b, c, d] in equation 2*a+3*b-(c*c)+d = 100.
     * {@param aIndividual}
     * {@return score(fitness)} of every individual.
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
     * The function {@code calculateFitness} returns the fitness score of Individual in the given population
     * by substituting Individual chromosome elements [a, b, c, d] in equation 2*a+3*b-(c*c)+d = 100.
     * {@param aIndividual}
     * {@return score(fitness)} of every individual in population.
     *
     */

    public static int calculateFitness(Population aPopulation){
        int total = 0;
        for(Individual i: aPopulation.getPopulation()){
            int s = calculateFitness(i);
            
            total += s;
        }
        total = total/aPopulation.getPopulation().size();
        aPopulation.setPopulationFitness(total);

        return total;
    }


}
