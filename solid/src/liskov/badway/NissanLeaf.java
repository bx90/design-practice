package liskov.badway;

public class NissanLeaf implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Adding speed...");
    }

    @Override
    public void addFuel() {
        // throw exception or do nothing.
        // Here is the problem. Check reason in the Main class within the package.

    }
}
