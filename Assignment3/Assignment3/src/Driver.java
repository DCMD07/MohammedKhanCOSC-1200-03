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