/**
 * Name: Mohammed Aasim
 * Date: July 26, 2024
 * Description: Creates vaccine instances and displays their details in different formats.
 */

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        // Create an array to save all the vaccines
        Vaccine[] vaccines = new Vaccine[3];

        // Default vaccine
        vaccines[0] = new Vaccine();
        System.out.println("Displaying default vaccine details in a non-linear format:");
        vaccines[0].display(false);
        // Setting values to the default vaccine
        vaccines[0].setVaccineId(101);
        vaccines[0].setVaccineName("Pfizer");
        vaccines[0].setUnitCost(19.99);
        vaccines[0].setQuantity(500);
        vaccines[0].setExpiryDate(LocalDate.of(2025, 12, 31));
        System.out.println("\nUpdated Vaccine Details:");
        vaccines[0].display(false);

        // Creating more vaccines with the parameterized constructor
        vaccines[1] = new Vaccine(102, "Moderna", 20.99, 400, LocalDate.of(2026, 1, 31));
        vaccines[2] = new Vaccine(103, "AstraZeneca", 15.50, 450, LocalDate.of(2025, 11, 30));

        // Display all vaccines in table format
        System.out.println("\nVaccine Records in Table Format:");
        System.out.println(" SKU | Vaccine Name          |  Unit Cost  |  QTY  | Expiry Date");
        System.out.println("-----|-----------------------|-------------|-------|------------");
        for (Vaccine vaccine : vaccines) {
            vaccine.display(true);
        }
    }
}