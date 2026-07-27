package app;
import model.BankAccount;
import model.Product;
import model.Rectangle;
public class Main {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(43, 6);
    Product product = new Product(123,"but chi",3.12,3);
        System.out.println(product.getId());

        if(rectangle.getLength() != -1){
            System.out.println("Chieu dai la: "+rectangle.getLength());

        }
        if (rectangle.getWidth() !=-1){
            System.out.println("Chieu rong la: " + rectangle.getWidth());
        }
        System.out.println("chu vi la: " + rectangle.getParameter());
        System.out.println("Dien tich la : "+ rectangle.getArea());
    }
    BankAccount bankAccount= new BankAccount();
}

