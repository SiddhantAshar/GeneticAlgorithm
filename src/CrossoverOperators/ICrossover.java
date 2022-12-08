package CrossoverOperators;

import GAElements.Individual;

public interface ICrossover {
    public Individual[] getChildren(Individual[] theParents);
}
