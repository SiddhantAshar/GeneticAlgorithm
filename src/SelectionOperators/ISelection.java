package SelectionOperators;

import GAElements.Individual;
import GAElements.Population;
/**
 * The interface {@code ISelection} contains method for selecting parents
 *
 */
public interface ISelection {

    /**Implementation of selectParents method is done in SelectionElite, SelectionRandom, SelectionTournament classes
     * {@param aPopulation} is the object of Population class
     */
    public Individual[] selectParents(Population aPopulation);
}
