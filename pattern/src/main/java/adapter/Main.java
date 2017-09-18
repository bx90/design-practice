package adapter;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle sedan = new Sedan();
        Vehicle bike = new BikeAdaptToVehicle(new Bike());

        bus.accelerate();
        sedan.accelerate();
        bike.accelerate();

    }
}
