package GAElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Population {
    ArrayList <Individual> population = new ArrayList<>();

	int populationFitness = -1;
    
    private Population() {}

    private static class SingletonHelper{
        private static final Population _instance = new Population();
    }

    public static Population getInstance() {
        return Population.SingletonHelper._instance;
    }
    
    public ArrayList<Individual> getPopulation() {
		return population;
	}
    
    public void setPopulationFitness(int aFitness){
        populationFitness = aFitness;
    }
    
	public int getPopulationFitness() {
		return populationFitness;
	}

    public void generateRandomPopulation(int aSize){
        for(int i=0; i<aSize; i++) {
            population.add(Individual.getRandomIndividual());
        }
    }

    public void kill(int aSize){

//        // RANDOM KIL
//        for(int j=0; j<aSize; j++) {
//            int index = (int) ((Math.random() * 100 % aSize));
//            population.remove(index);
//        }

        // Weakest 2 + Random 2
        for(int j=0; j<aSize; j++) {
            if (j<aSize/2){
                int index = (int) ((Math.random() * 100 % aSize));
                population.remove(index);
            }
            else{
               population.remove(population.size()-1);
            }
        }

    }

    public void add(Individual[] theIndividuals){
        population.addAll(Arrays.asList(theIndividuals));
    }

    public void printPopulation(){
        for (Individual i:population) {
            System.out.println(i);
        }
    }

}
