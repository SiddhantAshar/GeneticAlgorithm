package GAOperatorFactory;

import CrossoverOperators.ICrossover;
import MutatationOperators.IMutation;
import SelectionOperators.ISelection;
/**
 * The interface @code IGAOperatorFactory contains methods for performing basic Selection, Crossover and Mutation functions
 * whose implementations are present in GANaiveOperatorFactory, GARandomFactory and GAOptimisedOperatorFaactory classes
 *
 */
public interface IGAOperatorFactory {

    public ISelection getSelectionOperator();
    public ICrossover getCrossoverOperator();
    public IMutation getMutationOperator();

}
