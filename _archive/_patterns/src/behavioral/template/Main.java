package behavioral.template;
/**
 *  In Template pattern, an abstract class exposes defined way / template to execute its methods
 *
 *  Its subclasses can override the method implementation as per need but the invocation
 *  is to be in the same way as defined by an abstract class
 *
 */
public class Main {
    public static void main(String[] args) {
        Algorithm bubble = new BubbleSort();
        Algorithm insertion = new InsertionSort();

        bubble.sort();
        insertion.sort();

    }
}
