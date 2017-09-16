package creational.factory;

public class AlgorithmFactory {
    public static final int SEARCH = 0;
    public static final int TREE = 1;

    public static Algorithm createAlgorithm(int type) {
        switch (type) {
            case SEARCH :
                return new Search();
            case TREE :
                return new Tree();
            default:
                return null;
        }
    }
}
