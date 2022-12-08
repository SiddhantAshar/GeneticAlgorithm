package SelectionOperators;

import GAElements.Individual;
import GAElements.Population;

public interface ISelection {
    public Individual[] selectParents(Population aPopulation);
}
