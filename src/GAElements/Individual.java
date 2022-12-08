package GAElements;

public class Individual {
    public int [] chromosome = new int[4];
    int fitnessScore = 0;

    public Individual(int a, int b, int c, int d) {
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
