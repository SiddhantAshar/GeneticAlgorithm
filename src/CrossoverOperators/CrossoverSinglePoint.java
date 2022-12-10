package CrossoverOperators;

import GAElements.Individual;

/**
 * The class {@code CrossoverOperators} contains methods for performing Single Point crossover between parents
 *
 */

public class CrossoverSinglePoint implements ICrossover{

	/**
	 * The function {@code getChildren} contains logic for generating new children by alternate crossover between
	 * the parents.Consider p1, p2 as parents with chromosomes p1 = [a1, b1, c1, d1] and p2 = [a2, b2, c2, d2].
	 * A single point crossover will break parents chromosome in two parts and the children will have one part
	 * from each parent. The single point crossover will give children c1 and c2 from parents p1 and p2 as
	 * c1 = [a1, b1, c2, d2] and c2 = [a2, b2, c1, d1].
	 * {@param theParents} of type individual array.
	 * {@returns children} of the type individual array.
	 *
	 */
	int pivot;
    @Override
    public Individual[] getChildren(Individual[] theParents) {
    	
    	pivot = theParents[0].getChromosome().length/2;
    	
    	Individual[] children = new Individual[4];
        for (int i=0; i<children.length; i++) {
			children[i] = new Individual(0,0,0,0);
		}
    	
    	for(int i=0; i<theParents.length/2; i++) { //1st + 3rd parent and 2nd + 4th parent
    		int[] child1 = new int[4];
			int[] child2 = new int[4];
    		for(int j=0; j<theParents[i].getChromosome().length; j++) {
    			
    			if(j<pivot) {
    				child1[j] = theParents[i].getChromosome()[j];
        			child2[j] = theParents[i+2].getChromosome()[j];
    			} else {
    				child1[j] = theParents[i+2].getChromosome()[j];
    				child2[j] = theParents[i].getChromosome()[j];
    			}
    			
    		}
    		children[i].setChromosome(child1);
    		children[i+2].setChromosome(child2);
    	}
    	
        return children;
    }
}
