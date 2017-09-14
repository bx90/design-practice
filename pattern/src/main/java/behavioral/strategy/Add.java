package behavioral.strategy;

public class Add implements Strategy {
    @Override
    public void operation(int number, int anotherNumber) {
        System.out.println(number + anotherNumber);
    }
}
