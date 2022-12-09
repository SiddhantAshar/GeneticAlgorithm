package CrossoverOperators;

import GAElements.Individual;

public class CrossoverSinglePoint implements ICrossover{
    @Override
    public Individual[] getChildren(Individual[] theParents) {
        return new Individual[0];
    }
}
