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
