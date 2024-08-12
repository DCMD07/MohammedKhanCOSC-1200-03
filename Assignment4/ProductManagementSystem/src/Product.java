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

