package structural.decorator;

public class BeverageDecorator implements Beverage {
    Beverage beverage;
    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }

    @Override
    public int getPrice() {
        return this.beverage.getPrice();
    }
}
