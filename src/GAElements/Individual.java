package GAElements;

import java.util.Arrays;
import java.util.Random;

public class Individual {
    int [] chromosome = new int[4];
    int fitnessScore = -1;

    public Individual(int a, int b, int c, int d) {
        chromosome[0] = a;
        chromosome[1] = b;
        chromosome[2] = c;
        chromosome[3] = d;
    }

    public static Individual getRandomIndividual(){
    	Random r = new Random();
        return new Individual(
        		r.nextInt(51),
        		r.nextInt(51),
        		r.nextInt(51),
        		r.nextInt(51)
        );
    }

    public void setFitnessScore(int aScore){
        fitnessScore = aScore;
    }
    
    public int getFitnessScore() {
		return fitnessScore;
	}
    
    public int[] getChromosome() {
		return chromosome;
	}

	public void setChromosome(int[] theChromosomes) {
		chromosome = theChromosomes;
	}

	

	@Override
    public String toString() {
    	return (Arrays.toString(chromosome) + " Score: " + fitnessScore);
    }

}
