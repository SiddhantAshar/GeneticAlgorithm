package MutatationOperators;

import GAElements.Individual;

public interface IMutation {
    public Individual[] mutate(Individual [] theChildren);
}
