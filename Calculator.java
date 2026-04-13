/* Name: Manuel Ortiz */
/* Date: 04/12/2026 */
/* Assignment: 1.4 Project: User Interactions and I/O */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Introduction and welcome message
        System.out.println();
        System.out.println();
        System.out.println("Project for week 1");
        System.out.println("Java calculator");
        System.out.println("Manuel Ortiz");

        // Explanation of the program and instructions for the user
        System.out.println();
        System.out.println("Welcome to the Java calculator!");
        System.out.println("Today we are going to perform some basic math operations.");
        System.out.println("We are going to add 2 whole numbers");
        System.out.println("And we are going to subtract 2 decimal numbers.");

        // Addition of 2 whole numbers
        System.out.println();
        System.out.println("Let's start with the addition of 2 whole numbers.");
        System.out.print("Please enter the first whole number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second whole number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, sum);

        // Subtraction of 2 decimal numbers
        System.out.println();
        System.out.println();
        System.out.println("Now let's move on to the subtraction of 2 decimal numbers.");
        System.out.print("Please enter the first decimal number: ");
        double dec1 = scanner.nextDouble();
        System.out.print("Please enter the second decimal number: ");
        double dec2 = scanner.nextDouble();
        double difference = dec1 - dec2;
        System.out.printf("%.4f - %.4f = %.4f", dec1, dec2, difference);

        // Closing message and farewell
        System.out.println();
        System.out.println();
        System.out.println("Thank you for using the Java calculator!");
        System.out.println("Have a great day!");

        scanner.close();
    }
}