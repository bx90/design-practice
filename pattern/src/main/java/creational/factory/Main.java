package creational.factory;


/**
 * Factory ...
 */
public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SEARCH);
        algorithm.solve();

    }
}
