package MutatationOperators;

import GAElements.Individual;
/**
 * The class @code MutationRandom contains method for mutating children
 *
 */
public class MutationRandom implements IMutation{
    @Override
    /**
     * @param theChildren is the object of class Individual which is accepted by the method mutate
     * In this method, if the value generated from math.random function is less than or equal to 5,
     * they are being considered as mutated children and they are not considered for the calculation of fitness.
     * That particular chromosomeIndex is appended as childrenIndex.
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
