package MutatationOperators;

import GAElements.Individual;

public class MutationRandom implements IMutation{
    @Override
    public Individual[] mutate(Individual[] theChildren) {
        boolean ifMutate = (int) (Math.random()*10) <= 5;
        if(ifMutate){
            int childrenIndex = (int) (Math.random()*100) % theChildren.length;
            int chromosomeIndex = (int) (Math.random()*100) % theChildren[childrenIndex].chromosome.length;
            int value = (int) (Math.random()*100);
            theChildren[childrenIndex].chromosome[chromosomeIndex] = value;
        }

        return theChildren;
    }
}
