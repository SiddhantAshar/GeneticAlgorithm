
package GAOperatorFactory;

import CrossoverOperators.CrossoverSinglePoint;
import CrossoverOperators.ICrossover;
import MutatationOperators.IMutation;
import MutatationOperators.MutationRandom;
import SelectionOperators.ISelection;
import SelectionOperators.SelectionTournament;

public class GAOptimisedOperatorFactory implements IGAOperatorFactory {
    /**
     * The class {@code GANaiveOperatorFactory} contains methods for performing basic
     * {@param a, @param b}
     *
     */

    @Override
    public ISelection getSelectionOperator() {
        return new SelectionTournament();
    }

    @Override
    public ICrossover getCrossoverOperator() {
        return new CrossoverSinglePoint();
    }

    @Override
    public IMutation getMutationOperator() {
        return new MutationRandom();
    }
}