package SelectionOperators;

import GAElements.Individual;
import GAElements.IndividualComparator;
import GAElements.Population;
/**
 * The class @code SelectionElite contains method for selecting parents
 *
 */
public class SelectionElite implements ISelection {
    @Override
    /**
     * @param aPopulation is the object of class Population which is accepted by the method selectParents
     * In this method, the population is sorted and first 4 individuals are selected as parents from the Individual array
     *
     * @return selectedParents of the type Individual array
     */
    public Individual[] selectParents(Population aPopulation) {
        Individual[] selectedParents = new Individual[4];
//        aPopulation.population.sort(new IndividualComparator());
		for (int x=0; x<4; x++){
			selectedParents[x] = aPopulation.getPopulation().get(x);
		}
        return selectedParents;
    }
}
