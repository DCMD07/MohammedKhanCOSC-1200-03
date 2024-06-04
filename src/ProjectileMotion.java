// Name: Mohammed Aasim
// Program name: ProjectileMotion
// Date: 06/03/2024
// description: This program calculates the maximum horizontal distance of a projectile
// based on user input for initial speed and launch angle.


import java.util.Scanner;

import java.util.Scanner;

public class ProjectileMotion {

    public static void main(String[] args) {
        // Constant for gravitational force
        final double GRAVITY = 9.8; // in meters per second squared

        // Variables for user inputs
        double initialVelocity; // Speed at which the projectile is launched
        double launchAngle;     // Angle at which the projectile is launched
        double maxDistance;     // Maximum horizontal distance traveled by the projectile

        // Create a Scanner object for reading user inputs
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the initial velocity
        System.out.print("Enter the initial velocity of the projectile (m/s): ");
        initialVelocity = Math.abs(scanner.nextDouble()); // Use absolute value to handle negative inputs
    // Prompt the user to enter the initial velocity
        System.out.print("Enter the initial velocity of the projectile (m/s): ");
        initialVelocity = Math.abs(scanner.nextDouble()); // Use absolute value to handle negative inputs

        // Prompt the user to enter the launch angle
        System.out.print("Enter the launch angle of the projectile (degrees): ");
        launchAngle = Math.abs(scanner.nextDouble()); // Use absolute value to handle negative inputs

        // Convert the launch angle from degrees to radians
        double launchAngleRadians = Math.toRadians(launchAngle);

        // Calculate the maximum horizontal distance using the provided formula
        maxDistance = (Math.pow(initialVelocity, 2) * Math.sin(2 * launchAngleRadians)) / GRAVITY;
         // Display the calculated maximum horizontal distance
        System.out.printf("The maximum horizontal distance of the projectile is: %.3f meters\n", maxDistance);

        // Close the scanner object
        scanner.close();



