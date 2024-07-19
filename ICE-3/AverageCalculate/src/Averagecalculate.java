// Name: Mohammed Aasim Al Khan
// Program Name: AverageCalculate
// Date: 07/18/2024
// Description: This program calculates the average of numbers entered by the user with error handling for
// invalid inputs

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        int numOfValues = 0;  // Number of values to be entered
        double sum = 0;       // Sum of the entered values
        int count = 0;        // Count of valid entered values
     // Prompt user to enter the number of values
        System.out.print("How many values do you want to enter: ");
        while (true) {
            try {
                numOfValues = Integer.parseInt(scanner.nextLine());
                if (numOfValues <= 0) {
                    System.out.print("Please enter a positive number: ");
                } else {
                    break;  // Exit loop if input is valid
                }
            } catch (NumberFormatException e) {
                System.out.print("Please enter a numeric value: ");
            }
        }
        // Prompt user to enter each value
        for (int i = 1; i <= numOfValues; i++) {
            System.out.print("Enter value #" + i + ": ");
            while (true) {
                try {
                    int value = Integer.parseInt(scanner.nextLine());
                    if (value < 0) {
                        System.out.print("Please enter a positive value: ");
                    } else {
                        sum += value;  // Add valid value to sum
                        count++;       // Increment count of valid values
                        break;         // Exit loop if input is valid
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Please enter a numeric value: ");
                }
            }
        }