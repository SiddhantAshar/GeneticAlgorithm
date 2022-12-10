package SelectionOperators;

import GAElements.Individual;
import GAElements.IndividualComparator;
import GAElements.Population;

public class SelectionElite implements ISelection {
    @Override
    public Individual[] selectParents(Population aPopulation) {
        Individual[] selectedParents = new Individual[4];
//        aPopulation.population.sort(new IndividualComparator());
		for (int x=0; x<4; x++){
			selectedParents[x] = aPopulation.getPopulation().get(x);
		}
        return selectedParents;
    }
}
