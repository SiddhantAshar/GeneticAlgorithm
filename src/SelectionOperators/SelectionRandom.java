package SelectionOperators;

import GAElements.Individual;
import GAElements.Population;

import java.util.ArrayList;

public class SelectionRandom implements ISelection {

    @Override
    public Individual[] selectParents(Population aPopulation) {
        ArrayList<Integer> selectedParentsIndex = new ArrayList<>();
        Individual[] selectedParents = new Individual[4];
        int i=0;
        int candidateParentIndex = -1;
        while(i<4) {
            candidateParentIndex = (int)(Math.random()*10);
            if(!selectedParentsIndex.contains(candidateParentIndex)) {
                selectedParents[i] = aPopulation.population.get(i);
                selectedParentsIndex.add(candidateParentIndex);
                i++;
            }
        }
        return selectedParents;
    }


}
