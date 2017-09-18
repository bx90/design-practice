package decorator;

public class Sugar extends BeverageDecorator {
//    Beverage beverage;

    public Sugar(Beverage beverage) {
        super(beverage);
//        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " suger ";
    }

    @Override
    public int getPrice() {
        return this.beverage.getPrice() + 1;
    }
}
