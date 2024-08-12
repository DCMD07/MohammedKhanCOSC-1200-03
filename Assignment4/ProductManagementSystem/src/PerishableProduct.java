import java.util.Date;

public class PerishableProduct extends Product {
    // Attribute to store the expiry date of the product
    private Date expiryDate;

    // Default constructor initializing the expiry date to the current date
    public PerishableProduct() {
        super();
        this.expiryDate = new Date();  // Sets expiry date to today's date
    }

    // Constructor to initialize all fields, including expiry date
    public PerishableProduct(int sku, String name, double unitCost, int quantityOnHand, int quantityNeeded, String specialInstructions, Date expiryDate) {
        super(sku, name, unitCost, quantityOnHand, quantityNeeded, specialInstructions);
        this.expiryDate = expiryDate;
    }

    // Getter and setter for the expiry date
    public final Date getExpiryDate() {
        return expiryDate;
    }

    public final void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Method to display the details of the perishable product, including expiry date
    @Override
    public void display() {
        super.display();  // Call the display method from the Product class
        System.out.println("Expiry Date: " + expiryDate);
    }
}
