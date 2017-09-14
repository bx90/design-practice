package liskov.badway;

public class HondaAccord implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Speed...");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding fuel...");

    }
}
