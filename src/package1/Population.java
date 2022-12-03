package package1;

import java.util.ArrayList;
import java.util.Arrays;

public class Population {
    ArrayList <Individual> population = new ArrayList<>();
    int populationFitness = 0;
    int stopGeneration = 0;

    public void generateRandomPopulation(int aSize){
        for(int i=0; i<aSize; i++) {
            int a = (int)(Math.random()*100);
            int b = (int)(Math.random()*100);
            int c = (int)(Math.random()*100);
            int d = (int)(Math.random()*100);

            population.add(new Individual(a,b,c,d));
        }
    }

    public void setPopulationFitness(int aFitness){
        populationFitness = aFitness;
    }

    public void kill(int aSize){
        for(int j=0; j<aSize; j++) {
            int index = (int) ((Math.random() * 100 % aSize));
            population.remove(index);
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
