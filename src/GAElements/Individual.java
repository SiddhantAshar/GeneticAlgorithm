package GAElements;

import java.util.Arrays;
import java.util.Random;
/**
 * The class {@code Individual} stores array of chromosomes and declares fitnessScore = -1.
 *
 */
public class Individual {
    int [] chromosome = new int[4];
    int fitnessScore = -1;

    /**
     * The constructor {@code Individual} has parameters of chromosomes a, b, c and d
     *
     */
    public Individual(int a, int b, int c, int d) {
        chromosome[0] = a;
        chromosome[1] = b;
        chromosome[2] = c;
        chromosome[3] = d;
    }
    /**
     * The method {@code getRandomIndividual} generates random individuals.
     *
     */
    public static Individual getRandomIndividual(){
    	Random r = new Random();
        return new Individual(
        		r.nextInt(51),
        		r.nextInt(51),
        		r.nextInt(51),
        		r.nextInt(51)
        );
    }
    /**
     * The void {@code setFitnessScore} declares fitnessScore = aScore
     *
     */
    public void setFitnessScore(int aScore){
        fitnessScore = aScore;
    }

    /**
     * The method int {@code getFitnessScore} returns fitnessScore
     * @return fitnessScore
     */

    public int getFitnessScore() {
		return fitnessScore;
	}

    /**
     * The int {@code getChromosomes} method returns chromosomes
     * {@return fitnessScore}
     */
    public int[] getChromosome() {
		return chromosome;
	}
    /**
     * The void {@code setChromosomes} declares chromosomes = theChromosomes
     *
     */
	public void setChromosome(int[] theChromosomes) {
		chromosome = theChromosomes;
	}

	

	@Override
    public String toString() {
    	return (Arrays.toString(chromosome) + " Score: " + fitnessScore);
    }

}
