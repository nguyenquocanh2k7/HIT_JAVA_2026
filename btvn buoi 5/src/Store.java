import java.util.ArrayList;

public class Store {
    private ArrayList<Smartphone> inventory;

    public Store() {
        inventory = new ArrayList<>();
    }

    public void addPhoneToStore(Smartphone phone) {
        inventory.add(phone);
    }

    public Smartphone search(String id) {
        for (Smartphone phone : inventory) {
            if (phone.getId().equals(id)) return phone;
        }
        return null;
    }

    public ArrayList<Smartphone> search(double minPrice, double maxPrice) {
        ArrayList<Smartphone> result = new ArrayList<>();
        for (Smartphone phone : inventory) {
            if (phone.getPrice() >= minPrice && phone.getPrice() <= maxPrice) {
                result.add(phone);
            }
        }
        return result;
    }


    public ArrayList<Smartphone> search(String keyword, boolean isName) {
        ArrayList<Smartphone> result = new ArrayList<>();
        if (isName) {
            for (Smartphone phone : inventory) {
                if (phone.getName().toLowerCase().contains(keyword.toLowerCase())) {
                    result.add(phone);
                }
            }
        }
        return result;
    }

    public void sellPhone(Customer customer, String phoneId) {
        Smartphone phone = search(phoneId);
        if (phone != null && phone.getStock() > 0) {
            phone.setStock(phone.getStock() - 1);
            customer.addPhone(phone);
        }
    }


    public double calculateInventoryValue() {
        double total = 0;
        for (Smartphone phone : inventory) {
            total += phone.getFinalPrice() * phone.getStock();
        }
        return total;
    }
}