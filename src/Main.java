import Algorithms.AbstractAlgorithm;

public class Main {

    public static void main(String[] args) throws Exception {

        String algorithmName = args[0];

        AlgorithmFactory factory = new AlgorithmFactory();
        AbstractAlgorithm algorithm = factory.getAlgorithm(algorithmName);
        System.out.println("Wykonujemy algorytm: " + algorithm.getName());

        algorithm.runAlgorithm(args);
    }
}
