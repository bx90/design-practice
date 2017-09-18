package structural.adapter;

public class Sedan implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Sedan::Acce...");
    }
}
