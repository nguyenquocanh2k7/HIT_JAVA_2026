package app;

import model.ElectronicToy;
import model.PlushToy;
import model.Toy;

public class Main {
    public static void main(String[] args) {
    Toy[] toys = new Toy[3];
        toys[0] = new Toy("T001", "Bộ xếp hình", 200.0, 10);
        toys[1] = new ElectronicToy("E001", "Robot thông minh", 1000.0, 5, 12);
        toys[2] = new PlushToy("P001", "Gấu bông Teddy", 300.0, 7, "Bông gòn");
    for (Toy dochoi:toys){
        dochoi.printInfo();
        System.out.println("----------------------------------------------------------------------------------");
    }

    }
}
