package package1;

public class GeneticAlgorithm {
	
	private GeneticAlgorithm() {}
	
	private static class SingletonHelper{
		private static final GeneticAlgorithm _instance = new GeneticAlgorithm();
	}
	
	public static GeneticAlgorithm getInstance() {
		return SingletonHelper._instance;
	}

}
