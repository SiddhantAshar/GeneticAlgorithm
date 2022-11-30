package package1;

public class Individual {
    int [] chromosome = new int[4];
    int fitnessScore = 0;

    Individual(int a, int b, int c, int d) {
        chromosome[0] = a;
        chromosome[1] = b;
        chromosome[2] = c;
        chromosome[3] = d;
    }

    public Individual getRandomIndividual(){
        return null;
    }

    public void setFitnessScore(int aScore){
        fitnessScore = aScore;
    }

}
