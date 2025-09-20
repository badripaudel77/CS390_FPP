package edu.miu.lab9.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter quantity of items to add (1-50): ");
                quantity = sc.nextInt();

                // Check for valid range
                if (quantity < 1 || quantity > 50) {
                    throw new IllegalArgumentException("Quantity must be between 1 and 50.");
                }
                validInput = true; // input is valid.

            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number (integer).");
                sc.nextLine(); // clear the invalid input from scanner buffer

            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Successfully added " + quantity + " items to your cart!");
        sc.close();
    }
}
