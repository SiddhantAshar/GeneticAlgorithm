package SelectionOperators;

import GAElements.Individual;
import GAElements.Population;

import java.util.ArrayList;
/**
 * The class @code SelectionRandom contains method for selecting parents
 *
 */
public class SelectionRandom implements ISelection {

    @Override
    /**
     * @param aPopulation is the object of class Population which is accepted by the method selectParents
     * In this method, 2 parents are selected randomly using math.random function form the Individual array
     * and stored in the selectedParentsIndex Arraylist.
     *
     *
     * @return selectedParents of the type Individual array
     */
    public Individual[] selectParents(Population aPopulation) {
        ArrayList<Integer> selectedParentsIndex = new ArrayList<>();
        Individual[] selectedParents = new Individual[4];
        int i=0;
        int candidateParentIndex = -1;
        while(i<4) {
            candidateParentIndex = (int)(Math.random()*10);
            if(!selectedParentsIndex.contains(candidateParentIndex)) {
                selectedParents[i] = aPopulation.getPopulation().get(candidateParentIndex);
                selectedParentsIndex.add(candidateParentIndex);
                i++;
            }
        }
        return selectedParents;
    }


}
