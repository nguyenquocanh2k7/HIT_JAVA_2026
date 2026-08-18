import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("iPhone 15", 20000000, 10);
        Smartphone s2 = new Smartphone("Samsung S24", 18000000, 5);
        Smartphone s3 = new Smartphone("Xiaomi 14", 12000000, 8);

        System.out.println(s1.getId());
        System.out.println(s2.getId());
        System.out.println(s3.getId());
        System.out.println("Tổng số điện thoại: " + Smartphone.getTotalPhones());


        Customer c1 = new Customer("Quốc Anh");
        c1.addPhone(s1);
        c1.addPhone(s2);

        ArrayList<Smartphone> cartCopy = c1.getCart();
        cartCopy.clear();
        System.out.println("Số lượng trong giỏ hàng sau clear: " + c1.getCart().size());


        Store store = new Store();
        store.addPhoneToStore(s1);
        store.addPhoneToStore(s2);
        store.addPhoneToStore(s3);

        Customer c2 = new Customer("Khách A");
        store.sellPhone(c2, s1.getId());


        s1.setPrice(25000000);
        System.out.println("Giá iPhone 15 trong giỏ khách: " + c2.getCart().get(0).getPrice());


        System.out.println("Tổng bill khách A: " + c2.calculateTotalBill());
        System.out.println("Giá trị kho hàng: " + store.calculateInventoryValue());

        Smartphone.setVatTax(0.08);
        System.out.println("Tổng bill khách A sau giảm thuế: " + c2.calculateTotalBill());
        System.out.println("Giá trị kho hàng sau giảm thuế: " + store.calculateInventoryValue());
    }
}