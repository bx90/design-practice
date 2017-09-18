package decorator;

/**
 * Has the run time flexibility.
 */
public class Main {
    public static void main(String[] args) {
        Beverage myCoffe = new Sugar(new Milk(new Coffee(new PlainBeverage())));
        System.out.println(myCoffe.getDescription() + myCoffe.getPrice());

    }
}
