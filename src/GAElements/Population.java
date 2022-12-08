package GAElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Population {
    public ArrayList <Individual> population = new ArrayList<>();
    public int populationFitness = 0;
    public boolean stopGeneration = false;

    public static Population getInstance() {
        return Population.SingletonHelper._instance;
    }


    private static class SingletonHelper{
        private static final Population _instance = new Population();
    }


    public void generateRandomPopulation(int aSize){
        Random r = new Random();
        for(int i=0; i<aSize; i++) {
            int a = r.nextInt(51);
            int b = r.nextInt(51);
            int c = r.nextInt(51);
            int d = r.nextInt(51);

            population.add(new Individual(a,b,c,d));
        }
    }

    public void setPopulationFitness(int aFitness){
        populationFitness = aFitness;
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
            System.out.println(Arrays.toString(i.chromosome) + " Score: " + i.fitnessScore);
        }
    }



}
