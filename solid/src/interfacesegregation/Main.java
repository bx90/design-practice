package interfacesegregation;

/**
 * client should not be forced to depend on methods
 * that it does not use.
 *
 * Break interfaces into smaller onces.
 *
 */
public class Main {
    public static void main(String[] args) {
        Tree balancedTree = new BalancedTree();
        Tree binarySearchTree = new BinarySearchTree();

        balancedTree.traverse();
        binarySearchTree.traverse();
    }

}
