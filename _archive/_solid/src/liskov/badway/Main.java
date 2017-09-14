package liskov.badway;

public class Main {
    public static void main(String[] args) {
        Vehicle accord = new HondaAccord();
        Vehicle leaf = new NissanLeaf();

        // here the leaf cannot substitute vehicle class,
        // since the addFuel is not implemented or throwing exception.
        leaf.addFuel();
    }

}
