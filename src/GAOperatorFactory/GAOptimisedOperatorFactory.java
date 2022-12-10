
package GAOperatorFactory;

import CrossoverOperators.CrossoverSinglePoint;
import CrossoverOperators.ICrossover;
import MutatationOperators.IMutation;
import MutatationOperators.MutationRandom;
import SelectionOperators.ISelection;
import SelectionOperators.SelectionTournament;
/**
 * The class @code GAOptimisedOperatorFactory contains methods for performing basic Selection, Crossover and Mutation functions
 *
 */
public class GAOptimisedOperatorFactory implements IGAOperatorFactory {

    /**
     * The getSelectionOperator method overrides the method present in IGAOperatorFactory interface.
     * @return  returns new SelectionTournament object
     */
    @Override
    public ISelection getSelectionOperator() {
        return new SelectionTournament();
    }

    /**
     * The getCrossoverOperator method overrides the method present in IGAOperatorFactory interface.
     * @return  returns new CrossoverSinglePoint object
     */
    @Override

    public ICrossover getCrossoverOperator() {
        return new CrossoverSinglePoint();
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