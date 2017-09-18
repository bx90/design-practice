package structural.decorator;

public class Milk extends BeverageDecorator {
//    Beverage beverage;

    public Milk(Beverage beverage) {
        super(beverage);
//        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " milk ";
    }

    @Override
    public int getPrice() {
        return this.beverage.getPrice() + 3;
    }

}
