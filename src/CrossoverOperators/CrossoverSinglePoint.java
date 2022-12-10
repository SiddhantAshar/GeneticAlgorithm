package CrossoverOperators;

import GAElements.Individual;

public class CrossoverSinglePoint implements ICrossover{
	
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
