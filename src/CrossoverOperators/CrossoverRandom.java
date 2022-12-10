package CrossoverOperators;

import GAElements.Individual;
/**
 * The class {@code CrossoverOperators} contains methods for performing random crossover between parents
 *
 */
public class CrossoverRandom implements ICrossover{
    /**
     * The function {@code getChildren} contains logic for generating new children by random crossover between
     * the parents.Consider a1 a2,b1 b2,c1 c2,d1 d2 as parents.
     * So in random crossover any Parents will be selected to crossover, and generate children
     * {@param theParents} of type Individual array.
     * @returns children of the type individual array.
     *
     */
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
