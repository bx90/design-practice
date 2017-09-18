package structural.adapter;

public class Bus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Acc::Bus...");
    }
}
