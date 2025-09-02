package edu.miu.badripaudel.lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @author Nguyen Khanh, Tran (ID: 619956)
 * @since 9/2/2025
 * <p>This is the assignment for lab 1, FPP course, MIU, IA</p>
 * Program name: <b>“Electricity Bill Generator”</b>
 */
public class Prog6 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String isExit;
        do {
            System.out.print("Enter user type (R/C/I):");
            String userType = reader.readLine().trim();
            System.out.print("Enter units consumed:");
            int unitsConsumed = Integer.parseInt(reader.readLine().trim());

            BigDecimal billAmt = new BigDecimal(0);
            billAmt = switch (userType.toUpperCase()) {
                case "R" -> new BigDecimal(unitsConsumed).multiply(new BigDecimal("0.12"));
                case "C" -> new BigDecimal(unitsConsumed).multiply(new BigDecimal("0.2"));
                case "I" -> new BigDecimal(unitsConsumed).multiply(new BigDecimal("0.35"));
                default -> billAmt;
            };

            //Print bill
            System.out.println("\n=== Electricity Bill ===");
            System.out.println("User Type:" + userType);
            System.out.println("Units Consumed:" + unitsConsumed);
            System.out.printf("Bill Amount:" + String.format("$%.2f", billAmt) + "\n");

            //Ask
            do {
                System.out.print("\nDo you want to calculate another bill? (Y or N):  ");
                isExit = reader.readLine();
            } while (!("Y".equalsIgnoreCase(isExit) || "N".equalsIgnoreCase(isExit)));

            if("N".equalsIgnoreCase(isExit)) {
                System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");
            }
            System.out.println("\n");

        } while ("Y".equalsIgnoreCase(isExit));
    }
}
