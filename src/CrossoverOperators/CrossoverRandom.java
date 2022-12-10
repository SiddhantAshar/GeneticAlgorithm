package CrossoverOperators;

import GAElements.Individual;
/**
 * The class {@code CrossoverOperators} contains methods for performing random crossover between parents
 *
 */
public class CrossoverRandom implements ICrossover{
    /**
     * The function {@code getChildren} contains logic for generating new children by random crossover between
     * the parents.Consider p1, p2 as parents with chromosomes p1 = [a1, b1, c1, d1] and p2 = [a2, b2, c2, d2].
     * A random crossover will shuffle parents chromosome randomly and assign it to the children chromosome.
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
        	
        	int[] child1 = new int[4];
			int[] child2 = new int[4];
			
        	for(int j=0; j<theParents[i].getChromosome().length; j++) {
        		
        		if(Math.random() < 0.5) {
    				child1[j] = theParents[i].getChromosome()[j];
        			child2[j] = theParents[i+2].getChromosome()[j];
    			} else {
    				child2[j] = theParents[i].getChromosome()[j];
    				child1[j] = theParents[i+2].getChromosome()[j];
    			}
        	}
        	
        	children[i].setChromosome(child1);
        	children[i+2].setChromosome(child2);
        }

        return children;
    }
}
