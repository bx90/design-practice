package structural.adapter;

public class BikeAdaptToVehicle implements Vehicle {
    private Bike bike;

    public BikeAdaptToVehicle(Bike bike) {
        this.bike = bike;
    }
    @Override
    public void accelerate() {
        bike.addSpeed();
    }
}
