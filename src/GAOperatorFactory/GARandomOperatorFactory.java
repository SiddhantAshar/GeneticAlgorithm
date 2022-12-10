package GAOperatorFactory;

import CrossoverOperators.CrossoverRandom;
import CrossoverOperators.ICrossover;
import MutatationOperators.IMutation;
import MutatationOperators.MutationRandom;
import SelectionOperators.ISelection;
import SelectionOperators.SelectionRandom;

public class GARandomOperatorFactory implements IGAOperatorFactory {
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
        return new CrossoverRandom();
    }

    @Override
    public IMutation getMutationOperator() {
        return new MutationRandom();
    }
}
