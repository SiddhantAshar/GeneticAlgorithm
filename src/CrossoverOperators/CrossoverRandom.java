package CrossoverOperators;

import GAElements.Individual;

public class CrossoverRandom implements ICrossover{
    @Override
    public Individual[] getChildren(Individual[] theParents) {
        Individual[] children = new Individual[4];
        for (int i=0; i<children.length; i++) {
			children[i] = new Individual(0,0,0,0);
		}
        
        for(int i=0; i<theParents.length/2; i++) { //1st & 3rd parent + 2nd & 4th parent
        	for(int j=0; j<theParents[i].chromosome.length; j++) {
        		if(Math.random() < 0.5) {
        			children[i].chromosome[j] = theParents[i].chromosome[j];
        			children[i+2].chromosome[j] = theParents[i+2].chromosome[j];
        		} else {
        			children[i+2].chromosome[j] = theParents[i].chromosome[j];
        			children[i].chromosome[j] = theParents[i+2].chromosome[j];
        		}
        	}
        }

        return children;
    }
}
