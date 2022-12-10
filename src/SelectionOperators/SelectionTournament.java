package SelectionOperators;

import GAElements.Individual;
import GAElements.Population;

import java.util.ArrayList;
/**
 * The class {@code SelectionTournament} contains method for selecting parents using a tournament based selection
 *
 */
public class SelectionTournament implements ISelection{
    @Override

    /**
     * {@param aPopulation} is the object of class Population which is accepted by the method selectParents
     * In this method, 2 Individuals I1 and I2 are selected randomly using math.random function form the population.
     * Among I1 and I2 the fittest individual selected as parent. A and Individual [] array of all selected parents is
     * returned.
     *
     *
     * {@return selectedParents} of the type Individual array
     */
    public Individual[] selectParents(Population aPopulation) {
        ArrayList<Integer> selectedParentsIndex = new ArrayList<>();
        Individual[] selectedParents = new Individual[4];
        int i=0;
        while(i<4) {
            int candidateParent1Index = -1;

            do {
                candidateParent1Index = (int) (Math.random() * 10);
            } while (selectedParentsIndex.contains(candidateParent1Index));


            int candidateParent2Index = -1;
            while(candidateParent1Index != candidateParent2Index && !selectedParentsIndex.contains(candidateParent2Index))
                candidateParent2Index = (int)(Math.random()*10);

            if (aPopulation.getPopulation().get(candidateParent1Index).getFitnessScore() < aPopulation.getPopulation().get(candidateParent2Index).getFitnessScore()){
                selectedParents[i] = aPopulation.getPopulation().get(candidateParent1Index);
                selectedParentsIndex.add(candidateParent1Index);
            }
            else{
                selectedParents[i] = aPopulation.getPopulation().get(candidateParent2Index);
                selectedParentsIndex.add(candidateParent2Index);
            }

            i++;
        }

        return selectedParents;
    }
}
