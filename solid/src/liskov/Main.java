package liskov;

public class Main {
    public static void main(String[] args) {
       NormalVehicle v1 = new HondaAccord();
       ElectricVehicle v2 = new NissanLeaf();

       v1.speed();
       v1.addFuel();
       v2.speed();
       v2.charge();

    }
}
