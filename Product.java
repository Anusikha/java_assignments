import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        // Populating the ArrayList with Product objects
        products.add(new Product("Product 1", 10.99, 5));
        products.add(new Product("Product 2", 5.99, 10));
        products.add(new Product("Product 3", 2.99, 3));

        // Iterating through the ArrayList and displaying the elements
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println();
        }

        // Sorting the ArrayList in increasing order of price using a Comparator
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));

        // Displaying the elements in increasing order of price
        System.out.println("Products sorted by price (ascending):");
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println();
        }
    }
}
