package behavioral.strategy;

public class OperationManager implements Strategy {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void operation(int number, int anotherNumber) {
        strategy.operation(number, anotherNumber);
    }
}
