package GAOperatorFactory;

import CrossoverOperators.ICrossover;
import MutatationOperators.IMutation;
import SelectionOperators.ISelection;

public interface IGAOperatorFactory {

    public ISelection getSelectionOperator();
    public ICrossover getCrossoverOperator();
    public IMutation getMutationOperator();

}
