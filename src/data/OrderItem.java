package data;

public class OrderItem {
    int quantity;
    Product product;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
