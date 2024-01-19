import java.util.HashMap;
import java.util.Map;

class MenuItem {
    private String name;
    private double price;
    private double rating;

    public MenuItem(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}

public class Cafe {
    private Map<String, MenuItem> menu;

    public Cafe() {
        this.menu = new HashMap<>();
    }

    public void addMenuItem(String name, double price, double rating) {
        MenuItem newItem = new MenuItem(name, price, rating);
        menu.put(name, newItem);
        System.out.println("Item added to the menu: " + name);
    }

    public void removeMenuItem(String name) {
        if (menu.containsKey(name)) {
            menu.remove(name);
            System.out.println("Item removed from the menu: " + name);
        } else {
            System.out.println("Item not found on the menu: " + name);
        }
    }

    public double calculateAverageRating() {
        if (menu.isEmpty()) {
            System.out.println("Menu is empty. Cannot calculate average rating.");
            return 0.0;
        }

        double totalRating = 0.0;
        for (MenuItem item : menu.values()) {
            totalRating += item.getRating();
        }

        return totalRating / menu.size();
    }

    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        cafe.addMenuItem("Coffee", 2.5, 4.2);
        cafe.addMenuItem("Sandwich", 5.0, 3.8);
        cafe.addMenuItem("Cake", 3.0, 4.5);

        cafe.removeMenuItem("Tea");

        double averageRating = cafe.calculateAverageRating();
        System.out.println("Average rating of the cafe: " + averageRating);
    }
}