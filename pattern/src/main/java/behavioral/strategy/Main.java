package behavioral.strategy;

/**
 * 1. Encapsulate the varies and feature changes should not effect it. - open-close
 * 2. Program to interface rather than the implementation.
 * 3. Favor composition over inheritance.
 */
public class Main {
    public static void main(String[] args) {
        OperationManager operationManager = new OperationManager();
        operationManager.setStrategy(new Add());
        operationManager.operation(2, 3);
        operationManager.setStrategy(new Multiply());
        operationManager.operation(2, 3);
    }

}
