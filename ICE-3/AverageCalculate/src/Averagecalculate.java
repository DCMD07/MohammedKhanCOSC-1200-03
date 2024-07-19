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