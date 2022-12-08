package GAOperatorFactory;

import CrossoverOperators.ICrossover;
import SelectionOperators.ISelection;
import GAElements.Individual;
import GAElements.Population;

public abstract class GAOperatorFactory {
    ISelection selectionType;
    ICrossover crossoverType;


    protected void setSelectionType(ISelection aSelectionType){
        selectionType = aSelectionType;
    }

    protected void setCrossoverType(ICrossover aCrossoverType){
        crossoverType = aCrossoverType;
    }


    public Individual[] selectParents(Population aPopulation){
        return selectionType.selectParents(aPopulation);
    };
    public Individual[] getChildren(Individual [] theParents)
    {
       return crossoverType.getChildren(theParents);
    };

    abstract public Individual[] mutate(Individual [] i);

}
