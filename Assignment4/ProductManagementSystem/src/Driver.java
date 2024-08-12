import java.util.ArrayList;
import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        // Create instances of Product with sample data
        Product p1 = new Product(101, "Laptop", 999.99, 10, 5, "Handle with care");
        Product p2 = new Product(102, "Smartphone", 599.99, 20, 10, "Fragile");
        Product p3 = new Product(103, "Tablet", 299.99, 15, 8, "Keep dry");

        // Create instances of PerishableProduct with sample data
        PerishableProduct pp1 = new PerishableProduct(201, "Milk", 2.99, 100, 50, "Keep refrigerated", new Date(2024, 8, 15));
        PerishableProduct pp2 = new PerishableProduct(202, "Cheese", 5.99, 50, 20, "Store in a cool place", new Date(2024, 9, 10));

        // Add all products to a list
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(pp1);
        products.add(pp2);

        // Display the details of all products in the list
        for (Product product : products) {
            product.display();
            System.out.println();  
        }
    }
}