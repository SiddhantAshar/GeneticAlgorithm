package CrossoverOperators;

import GAElements.Individual;

/**
 * The class {@code CrossoverOperators} contains methods for performing Single Point crossover between parents
 *
 */

public class CrossoverSinglePoint implements ICrossover{

	/**
	 * The function {@code getChildren} contains logic for generating new children by alternate crossover between
	 * the parents.Consider a1 a2,b1 b2,c1 c2,d1 d2 as parents.
	 * So in alternate crossover we will have children from parents a1 b1,c2 d2, a2 b2,a2 b1,c1 d1
	 * {@param theParents} of type individual array.
	 * @returns children of the type individual array.
	 *
	 */
	int pivot;
    @Override
    public Individual[] getChildren(Individual[] theParents) {
    	
    	pivot = theParents[0].chromosome.length/2;
    	
    	Individual[] children = new Individual[4];
        for (int i=0; i<children.length; i++) {
			children[i] = new Individual(0,0,0,0);
		}
    	
    	for(int i=0; i<theParents.length/2; i++) { //1st + 3rd parent and 2nd + 4th parent
    		for(int j=0; j<theParents[i].chromosome.length; j++) {
    			
    			if(j<pivot) {
    				children[i].chromosome[j] = theParents[i].chromosome[j];
        			children[i+2].chromosome[j] = theParents[i+2].chromosome[j];
    			} else {
    				children[i].chromosome[j] = theParents[i+2].chromosome[j];
        			children[i+2].chromosome[j] = theParents[i].chromosome[j];
    			}
    			
    		}
    		
    	}
    	
        return children;
    }
}
