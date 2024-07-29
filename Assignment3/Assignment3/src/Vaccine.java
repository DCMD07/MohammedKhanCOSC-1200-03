/**
 * Name: Mohammed Aasim
 * Date: July 26, 2024
 * Description: This class provides a structure to manage vaccine details including ID, name, cost, quantity,
 * and the expiry date.
 */

import java.time.LocalDate;

public class Vaccine {
    private int vaccineId;
    private String vaccineName;
    private double unitCost;
    private int quantity;
    private LocalDate expiryDate;

    // Default constructor
    public Vaccine() {
        this(0, "Default Vaccine", 0.0, 0, LocalDate.now());
    }

    // Parameterized constructor
    public Vaccine(int vaccineId, String vaccineName, double unitCost, int quantity, LocalDate expiryDate) {
        this.vaccineId = vaccineId;
        this.vaccineName = vaccineName;
        this.unitCost = unitCost;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    // Mutator methods
    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Display method
    public void display(boolean inTableFormat) {
        if (inTableFormat) {
            System.out.printf("%4d | %-20s | $%6.2f | %4d | %s\n", vaccineId, vaccineName, unitCost, quantity, expiryDate);
        } else {
            System.out.println("SKU: " + vaccineId);
            System.out.println("Vaccine Name: " + vaccineName);
            System.out.println("Unit Cost: $" + unitCost);
            System.out.println("Quantity on hand: " + quantity);
            System.out.println("Expiry Date: " + expiryDate);
        }
    }

    // Main method for independent testing
    public static void main(String[] args) {
        Vaccine defaultVaccine = new Vaccine();
        defaultVaccine.display(false);
    }
}