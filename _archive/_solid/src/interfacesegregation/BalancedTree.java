package interfacesegregation;

public class BalancedTree implements Tree, BalancedTreeInterface {
    @Override
    public void rotation() {
        System.out.println("Balanced Tree::rotation .... ");
    }

    @Override
    public void traverse() {
        System.out.println("Balanced Tree::traversing .... ");
    }
}
