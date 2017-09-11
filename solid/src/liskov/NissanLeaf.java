package liskov;

public class NissanLeaf implements ElectricVehicle {
    @Override
    public void charge() {
        System.out.println("Charging...");
    }

    @Override
    public void speed() {
        System.out.println("Braking....");
    }
}
