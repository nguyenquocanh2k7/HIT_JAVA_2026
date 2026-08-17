public class Product {
    String id;
    String name;
    double price;
    int quantity;

    Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getSubtotal() {
        return price * quantity;
    }
}
