package behavioral.visitor;

public class ShoppingCart implements ShoppingCartVisitor {
    @Override
    public double visit(ShoppingItem item) {
         return item.getPrice();
    }
}
