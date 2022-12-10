package MutatationOperators;

import GAElements.Individual;
/**
 * The class @code MutationRandom contains method for mutating children
 *
 */
public class MutationRandom implements IMutation{
    @Override
    /**
     * @param theChildren is the object of class Individual which is accepted by the method mutate.
     * In this method,one child is selected for mutation with probability of 50%. If selected, any one number in the
     * selected child chromosome is updated with a random number.
     * A and Individual [] array of children is returned.
     *
     * @return theChildren of the type Individual array
     */
    public Individual[] mutate(Individual[] theChildren) {
        boolean ifMutate = (int) (Math.random()*10) <= 5;
        if(ifMutate){
            int childrenIndex = (int) (Math.random()*100) % theChildren.length;
            int chromosomeIndex = (int) (Math.random()*100) % theChildren[childrenIndex].getChromosome().length;
            int value = (int) (Math.random()*100);
            int[] childChromosome = theChildren[childrenIndex].getChromosome();
            childChromosome[chromosomeIndex] = value;
    		theChildren[childrenIndex].setChromosome(childChromosome);
        }

        return theChildren;
    }
}
