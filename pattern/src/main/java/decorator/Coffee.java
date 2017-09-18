package decorator;

public class Coffee extends BeverageDecorator {
//    Beverage beverage;

    public Coffee(Beverage beverage) {
        super(beverage);
//        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " coffee ";
    }

    @Override
    public int getPrice() {
        return this.beverage.getPrice() + 5;
    }
}
