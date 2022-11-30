package package1;

import java.util.ArrayList;

public class Population {
    ArrayList <Individual> population = new ArrayList<>();
    int populationFitness = 0;

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

    }

    public void add(Individual[] theIndividuals){

    }



}
