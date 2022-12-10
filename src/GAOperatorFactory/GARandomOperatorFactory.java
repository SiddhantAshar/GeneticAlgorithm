package GAOperatorFactory;

import CrossoverOperators.CrossoverRandom;
import CrossoverOperators.ICrossover;
import MutatationOperators.IMutation;
import MutatationOperators.MutationRandom;
import SelectionOperators.ISelection;
import SelectionOperators.SelectionRandom;
/**
 * The class @code GARandomOperatorFactory contains methods for performing random Selection, Crossover and Mutation functions
 *
 */
public class GARandomOperatorFactory implements IGAOperatorFactory {
    /**
     * The class @code GARandomOperatorFactory contains methods for performing random Selection, Crossover and Mutation functions
     *
     */

    @Override
    public ISelection getSelectionOperator() {
        return new SelectionRandom();
    }
    /**
     * The getCrossoverOperator method overrides the method present in IGAOperatorFactory interface.
     * @return  returns new CrossoverRandom object
     */
    @Override
    public ICrossover getCrossoverOperator() {
        return new CrossoverRandom();
    }
    /**
     * The getMutationOperator method overrides the method present in IGAOperatorFactory interface.
     * @return  returns new MutationRandom object
     */
    @Override
    public IMutation getMutationOperator() {
        return new MutationRandom();
    }
}
