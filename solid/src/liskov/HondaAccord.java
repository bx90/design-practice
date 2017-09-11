package liskov;

public class HondaAccord implements NormalVehicle {
    @Override
    public void addFuel() {
        System.out.println("Adding fuel....");
    }

    @Override
    public void speed() {
        System.out.println("Accelerating ... ");
    }
}
