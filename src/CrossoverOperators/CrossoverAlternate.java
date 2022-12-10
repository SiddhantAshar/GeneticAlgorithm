package CrossoverOperators;

import GAElements.Individual;
/**
 * The class {@code CrossoverOperators} contains methods for performing alternate crossover between parents
 *
 */
public class CrossoverAlternate implements ICrossover {

    /**
     * The function {@code getChildren} contains logic for generating new children by alternate crossover between
     * the parents.Consider p1, p2 as parents with chromosomes p1 = [a1, b1, c1, d1] and p2 = [a2, b2, c2, d2].
     * Alternate crossover will create children c1 and c2 from parents p1 and p2 as c1 = [a1, b2, c1, d2] and
     * c2 = [a2, b1, c2, d1].
     * {@param theParents} of type individual array.
     * @returns children of the type individual array.
     *
     */

    @Override
    public Individual[] getChildren(Individual[] theParents) {
        Individual[] children = new Individual[4];
        for(int i=0; i<children.length; i++) {
        	children[i] = new Individual(0,0,0,0);
        }
        
        for(int i=0; i<theParents.length/2; i++) { //1st & 3rd parent + 2nd & 4th parent
        	
        	int[] child1 = new int[4];
			int[] child2 = new int[4];
			
        	for(int j=0; j<theParents[i].getChromosome().length; j++) {
        		
        		if(j%2 == 0) {
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

//        for(int i=0; i<2; i++) {
//            int a1 = theParents[i].chromosome[0];
//            int a2 = theParents[i+2].chromosome[0];
//            int b1 = theParents[i+2].chromosome[1];
//            int b2 = theParents[i].chromosome[1];
//            int c1 = theParents[i].chromosome[2];
//            int c2 = theParents[i+2].chromosome[2];
//            int d1 = theParents[i+2].chromosome[3];
//            int d2 = theParents[i].chromosome[3];
//
//
//            children[i] = new Individual(a1, b1, c1, d1);
//            children[i+2] = new Individual(a2,b2,c2,d2);
//
//        }

        return children;
    }
}
