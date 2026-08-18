import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Smartphone> cart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new ArrayList<>();
    }

    public void addPhone(Smartphone phone) {
        cart.add(phone);
    }

    public void removePhone(String id) {
        cart.removeIf(phone -> phone.getId().equals(id));
    }

    public void removePhone(int index) {
        if (index >= 0 && index < cart.size()) {
            cart.remove(index);
        }
    }

    public ArrayList<Smartphone> getCart() {
        return new ArrayList<>(cart); // Trả về bản sao
    }

    public double calculateTotalBill() {
        double total = 0;
        for (Smartphone phone : cart) {
            total += phone.getFinalPrice();
        }
        return total;
    }
}