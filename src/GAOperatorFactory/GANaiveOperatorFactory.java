package GAOperatorFactory;

import CrossoverOperators.CrossoverAlternate;
import CrossoverOperators.ICrossover;
import MutatationOperators.IMutation;
import MutatationOperators.MutationRandom;
import SelectionOperators.ISelection;
import SelectionOperators.SelectionElite;
/**
 * The class @code GANaiveOperatorFactory contains methods for performing basic Selection, Crossover and Mutation functions
 *
 */
public class GANaiveOperatorFactory implements IGAOperatorFactory {

    /**
     * The getSelectionOperator method overrides the method present in IGAOperatorFactory interface.
     * @return  returns new SelectionElite object
     */

    @Override
    public ISelection getSelectionOperator() {
        return new SelectionElite();
    }
    /**
     * The getCrossoverOperator method overrides the method present in IGAOperatorFactory interface.
     * @return  returns new CrossoverAlternate object
     */
    @Override
    public ICrossover getCrossoverOperator() {
        return new CrossoverAlternate();
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
