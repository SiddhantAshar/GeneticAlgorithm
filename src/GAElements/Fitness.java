package GAElements;

import GAElements.Individual;
import GAElements.Population;

public class Fitness {

    static int RHS = 100;

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
