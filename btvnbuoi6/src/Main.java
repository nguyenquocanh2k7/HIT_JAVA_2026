
public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("Nguyễn Văn A", "0987654321", "123 Lê Lợi, TPHCM");
        Order order = new Order("DH001", c);

        order.addProduct(new Product("P01", "Sách Java", 100000, 2));
        order.addProduct(new Product("P02", "Chuột máy tính", 250000, 1));
        order.addProduct(new Product("P03", "Bánh quy", 50000, 5));

        order.printInvoice();
    }
}