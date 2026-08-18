public class Smartphone {
    private static int totalPhones = 0;
    private static double vatTax = 0.10;

    private String id;
    private String name;
    private double price;
    private int stock;


    public Smartphone(String name, double price, int stock) {
        totalPhones++;
        this.id = "SP" + totalPhones;
        this.name = name;
        this.price = (price < 0) ? 0 : price;
        this.stock = (stock < 0) ? 0 : stock;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = (price < 0) ? 0 : price; }
    public void setStock(int stock) { this.stock = (stock < 0) ? 0 : stock; }

    public static int getTotalPhones() { return totalPhones; }

    public static void setVatTax(double tax) { vatTax = tax; }
    public double getFinalPrice() { return price + (price * vatTax); }
}
