package structural.decorator;

/**
 * This is the starting point/base object.
 *
 */
public class PlainBeverage implements Beverage {
    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
