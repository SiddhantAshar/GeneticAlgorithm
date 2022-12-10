Group Members:
1) Suramya Sureshbabu (Student No.- 22251388)
2) Shivani Girgune (Student No.- 22250522)
3) Jayant Rajdhar (Student No.- 22250298)
4) Sidhant Ashar (Student No.- 22250838)


1. How to compile and run the code
    As we have multiple-package & multiple-file structure, the compilation process involves multiple steps.

    # Step 0
        In the src/GAMain/Main.java, select the Creator for the genetic algorithm.
        The codes for 3 Creators are present in the file.
        Uncomment the respective lines for selecting GANaiveCreator, GAOptimisedCreator or GARandomCreator. (either of the 3)
        This will decide the behavior of the program.

    # Step 1
        From the terminal, navigate to the folder the project folder where the src/ folder is located.

    # Step 2
        Based on the OS, run the commands mentioned below for code compilation only

        For Windows:
            dir *.java /s /b > tmp.txt
            javac @tmp.txt -d bin
            del tmp.txt

            For Unix
                javac -d bin/ $(find . -type f -name "*.java")

    # Step 3
        For executing the code, run the commands below

        For Windows:
            java -classpath bin\ GAMain.Main

        For Unix:
            java -classpath bin/ GAMain.Main

        The program should now execute and the solution should be printed on the terminal.
        The same commands have been included in the "unix_compile_and_run.sh" and "windows_compile_and_run.bat" for the respective OS and can be run through the terminal.

2. Terminologies Used
    # Individual
        An individual is an array of Integers also called as chromosomes. Each element in the chromosome is used
        as the coefficient to solve the equation.

    # Population
        A population is a collection of Individuals

    # Score
        A score is assigned to each individual depending on the fitness of the Individual. The score here reflects
        the deviation from the expected answer. Hence, the lower the score is the fitter would be the Individual. The
        Individual with the score 0 is the fittest individual.


3. Output Explained
    # The output will be in two parts. The first part is detail of population in each generation.
        Example -
        --------------------------------------------------------
        Generation: 2 (Specify Generation number)
        [2, 16, 0, 45] Score: 3  (Fittest Individual)
        [2, 16, 4, 36] Score: 28
        [2, 16, 4, 36] Score: 28
        [3, 35, 2, 43] Score: 50
        [14, 34, 0, 21] Score: 51
        [40, 23, 4, 36] Score: 69
        [40, 23, 4, 36] Score: 69
        [26, 41, 14, 42] Score: 79
        [26, 41, 14, 42] Score: 79 (Weakest Individual)
        Population Fitness: 54 (Average Population Score)

        In similar fashion we will print population details for each generation.

    # The second part of the output is the final solution

        If the solution (score 0 or Fittest Individual) is not found even after iterating the generations over given
        generationThreshold times, the code will return the Fittest Individual available in the current population with
        its score.
        Example -
        =================== S O L U T I O N =====================
        Perfect solution not found.
        Fittest Individual:
        [33, 21, 6, 2] Score: 5
        =========================================================

        If the solution (score 0 or Fittest Individual) is found, the code will return the Fittest Individual Found and the
        generation number required to reach the population with the fittest individual.
        Example -
        =================== S O L U T I O N =====================
        Perfect solution found.
        Solution found at generation: 52
        Fittest Individual:
        [13, 36, 6, 2] Score: 0
        =========================================================


4. Pattern Implementation

    a.  __singleton pattern__

        # The singleton pattern implementation can be found in the Population.java file in the src/GAElements package.

        # The singleton pattern used here is BillPugh Singleton patten which is thread safe with lazy initialization.

        # The population class has been implemented with singleton pattern because the population object needs to be
          initialized only once during the lifetime of code execution. During each generation the same population
          object will be updated with new Individuals.


    b.  __strategy pattern__

        # Strategy Pattern is implemented in SelectionOperators.java src/SelectionOperators, Mutation
        src/MutationOperator and Crossover src/CrossoverOperator

        # Strategy Pattern: Selection has different behaviour like Elite Selection,Random Selection and
          Tournament Selection.
          Crossover has different behaviour like Alternate Crossover,Random Crossover and SinglePoint Crossover.
          Mutation has only Random Mutation.
        # Strategy Pattern allows object to incorporate different behaviours or algorithms by creating different
          interfaces.
          Strategy pattern has a class instantiating and usually give it strategy object that implements some behaviour
          Example: Interface ISelection is used for Selecting Parents and for Selection of Parents we have different
          behaviours like Elite Selection,Random Selection and Tournament Selection.
          
          The class GeneticAlgorithm (src/GAMain/GeneticAlgorithm.java) has 3 references, each one to store a 
          behaviour for Selection, Crossover and Mutation respectively.
          
          We can change the behavior of the program at runtime by only changing the reference to the GACreator object in the src/GAMain/Main.java
          e.g.-

          GACreator gaCreator = new GAOptimisedCreator();
          // GACreator gaCreator = new GANaiveCreator()
          GeneticAlgorithm geneticAlgorithm = gaCreator.createGeneticAlgorithm();


    c.  __factory pattern__

        # The implementation of the Factory Pattern can be found in GeneticAlgorithm class in the src/GAMain/GeneticAlgorithm.java file.
		
        # Abstract factory pattern has been used as we need to create a family of related objects. 
		
        # In the case of Genetic Algorithm, the objects that we are creating are the Operators for the algorithm.
          The interface IGAOperatorFactory declares what each GAOperatorFactory should do. Thus, we have 3 types of operator factories- 
          GANaiveOperatorFactory, GARandomOperatorFactory and GAOptimisedOperatorFactory that provide different set operators for the
          genetic algorithm.
          The client-programmer just needs to instantiate a different GACreator object that will provide the different OperatorFactory.
          Thus, providing a completely different behavior by changing a single line of code.
		  
          See: Documentation for GACreator, GAOperatorFactory, SelectionOperators, CrossoverOperators, MutationOperators.



Git Hub Link: https://github.com/SiddhantAshar/GeneticAlgorithm
