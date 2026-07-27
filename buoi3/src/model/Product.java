package model;
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    public Product(int id,String name,double price,int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) { this.id = id; }
    public String getName(){
        return name;
    }
    public void setName(String name) { this.name = name.trim(); }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double totalPrice(){
        return quantity*price;
    }
    public void printInfo(){
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice());
    }
}


