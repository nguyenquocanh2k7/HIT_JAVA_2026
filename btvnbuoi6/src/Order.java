public class Order {
    String orderId;
    Customer customer;
    Product[] items;
    int count;

    Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new Product[10]; // mảng cố định 10 sản phẩm
        this.count = 0;
    }

    void addProduct(Product p) {
        if (count < items.length) {
            items[count++] = p;
        } else {
            System.out.println("Không thể thêm sản phẩm, giỏ hàng đã đầy!");
        }
    }

    double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getSubtotal();
        }
        return total;
    }

    void printInvoice() {
        System.out.println("===== HÓA ĐƠN =====");
        System.out.println("Mã đơn hàng: " + orderId);
        System.out.println("Khách hàng: " + customer.name + " - " + customer.phone);
        System.out.println("Địa chỉ: " + customer.address);
        System.out.println("-------------------");
        for (int i = 0; i < count; i++) {
            Product p = items[i];
            System.out.println(p.name + " x" + p.quantity + " = " + p.getSubtotal());
        }
        System.out.println("-------------------");
        System.out.println("Tổng cộng: " + getTotal());
    }
}
