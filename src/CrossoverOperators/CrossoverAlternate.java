package CrossoverOperators;

import GAElements.Individual;
/**
 * The class {@code CrossoverOperators} contains methods for performing alternate crossover between parents
 *
 */
public class CrossoverAlternate implements ICrossover {

    /**
     * The function {@code getChildren} contains logic for generating new children by alternate crossover between
     * the parents.Consider a1 a2,b1 b2,c1 c2,d1 d2 as parents.
     * So in alternate crossover we will have children from parents a1 b2,c1 d2, a2 b1,a2 b1,c2 d1.
     * {@param theParents} of type individual array.
     * @returns children of the type individual array.
     *
     */

    @Override
    public Individual[] getChildren(Individual[] theParents) {
        Individual[] children = new Individual[4];

        for(int i=0; i<2; i++) {
            int a1 = theParents[i].chromosome[0];
            int a2 = theParents[i+2].chromosome[0];
            int b1 = theParents[i+2].chromosome[1];
            int b2 = theParents[i].chromosome[1];
            int c1 = theParents[i].chromosome[2];
            int c2 = theParents[i+2].chromosome[2];
            int d1 = theParents[i+2].chromosome[3];
            int d2 = theParents[i].chromosome[3];


            children[i] = new Individual(a1, b1, c1, d1);
            children[i+2] = new Individual(a2,b2,c2,d2);

        }

        return children;
    }
}
