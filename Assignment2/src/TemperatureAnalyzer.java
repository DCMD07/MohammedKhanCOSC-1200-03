/*
TemperatureAnalyzer.java
Date: 22nd June, 2024
Name: Mohammed Aasim Ali Khan
Description: This program analyzes temperature data for multiple days, calculates averages, and identifies the days with the lowest and highest temperatures.
*/

import java.util.Scanner;

public class TemperatureAnalyzer {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final int MIN_DAYS = 1;
    final int MAX_DAYS = 31;
    final int MIN_TEMP = -30;
    final int MAX_TEMP = 30;
    int numDays;

    // Get the number of days from the user
    do {
        System.out.print("Enter the number of days (1-31): ");
        numDays = input.nextInt();
    } while (numDays < MIN_DAYS || numDays > MAX_DAYS);

    double[] lowTemps = new double[numDays];
    double[] highTemps = new double[numDays];
    // Get the temperature data for each day from the user
    for (int i = 0; i < numDays; i++) {
        int day = i + 1;
        System.out.println("Day " + day + ": ");

        do {
            System.out.print("Enter the low temperature: ");
            lowTemps[i] = input.nextDouble();

            System.out.print("Enter the high temperature: ");
            highTemps[i] = input.nextDouble();

            if (lowTemps[i] < MIN_TEMP || lowTemps[i] > MAX_TEMP) {
                System.out.println("Error: Low temperature must be between " + MIN_TEMP + " and " + MAX_TEMP);
            } else if (highTemps[i] < MIN_TEMP || highTemps[i] > MAX_TEMP) {
                System.out.println("Error: High temperature must be between " + MIN_TEMP + " and " + MAX_TEMP);
            } else if (lowTemps[i] > highTemps[i]) {
                System.out.println("Error: Low temperature cannot be greater than high temperature");
            }
        } while (lowTemps[i] < MIN_TEMP || lowTemps[i] > MAX_TEMP || highTemps[i] < MIN_TEMP || highTemps[i] > MAX_TEMP || lowTemps[i] > highTemps[i]);

        double avgTemp = (lowTemps[i] + highTemps[i]) / 2.0;
        System.out.printf("The average temperature for day %d is %.2f\n", day, avgTemp);
    }
}

