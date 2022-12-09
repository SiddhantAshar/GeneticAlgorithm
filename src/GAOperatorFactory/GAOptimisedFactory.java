package GAOperatorFactory;

import CrossoverOperators.CrossoverAlternate;
import CrossoverOperators.ICrossover;
import GAElements.Individual;
import MutatationOperators.IMutation;
import MutatationOperators.MutationRandom;
import SelectionOperators.ISelection;
import SelectionOperators.SelectionElite;
import SelectionOperators.SelectionRandom;

public class GAOptimisedFactory implements IGAOperatorFactory {
    /**
     * The class {@code GANaiveOperatorFactory} contains methods for performing basic
     * {@param a, @param b}
     *
     */

    @Override
    public ISelection getSelectionOperator() {
        return new SelectionRandom();
    }

    @Override
    public ICrossover getCrossoverOperator() {
        return new CrossoverAlternate();
    }

    @Override
    public IMutation getMutationOperator() {
        return new MutationRandom();
    }
}
