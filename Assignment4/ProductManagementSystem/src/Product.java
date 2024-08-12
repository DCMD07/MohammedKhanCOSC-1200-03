/*
 * Name: Mohammed Aasim Ali Khan
 * Program: Product Management System
 * Date: August 12, 2024
 * Description: A simple Java console application to manage and display product information.
 */

public class Product {
    // Attributes representing the basic details of a product
    private int sku;  // Product ID
    private String name;  // Name of the product
    private double unitCost;  // Cost per unit
    private int quantityOnHand;  // Quantity available in stock
    private int quantityNeeded;  // Quantity that needs to be ordered
    private String specialInstructions;  // Special handling instructions

    // Default constructor initializing default values
    public Product() {
        this.sku = 0;
        this.name = "Unknown";
        this.unitCost = 0.0;
        this.quantityOnHand = 0;
        this.quantityNeeded = 0;
        this.specialInstructions = "None";
    }

    // Constructor for initializing with specific values
    public Product(int sku, String name, double unitCost, int quantityOnHand, int quantityNeeded, String specialInstructions) {
        this.sku = sku;
        this.name = name;
        this.unitCost = unitCost;
        this.quantityOnHand = quantityOnHand;
        this.quantityNeeded = quantityNeeded;
        this.specialInstructions = specialInstructions;
    }
// Accessors and mutators for each attribute
    public final int getSku() {
        return sku;
    }

    public final void setSku(int sku) {
        this.sku = sku;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public final int getQuantityOnHand() {
        return quantityOnHand;
    }

    public final void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public final int getQuantityNeeded() {
        return quantityNeeded;
    }

    public final void setQuantityNeeded(int quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    public final String getSpecialInstructions() {
        return specialInstructions;
    }

    public final void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Method to display the product details
    public void display() {
        System.out.println("SKU: " + sku);
        System.out.println("Product Name: " + name);
        System.out.println("Unit Cost: $" + unitCost);
        System.out.println("Quantity on Hand: " + quantityOnHand);
        System.out.println("Quantity Needed: " + quantityNeeded);
        System.out.println("Special Instructions: " + specialInstructions);
    }
}
