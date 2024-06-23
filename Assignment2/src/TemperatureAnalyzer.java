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


    }
}