package behavioral.visitor;

public interface ShoppingItem {
    double accept(ShoppingCartVisitor visitor);
    double getPrice();
}
