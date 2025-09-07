package edu.miu.badripaudel.lab1;

import java.util.Random;

/**
 * @author Badri Paudel
 * @since 9/1/2025
 * <p>This is the assignment for lab 1, FPP course, MIU, IA</p>
 * Program name: <b>“Quick EMI Quote Calculator”</b>
 */
public class QuickEmiQuote {

    public static void main(String[] args) {
        Random random = new Random();
        int p = random.nextInt(5000, 25000+1);
        // Double.MIN_VALUE is added because random number never produce exactly 1
        double apr = random.nextDouble(11.48, 11.5 + Double.MIN_VALUE);
        int n = random.nextInt(6, 36+1);
        // monthly interest rate, r
        double r = apr / (12 * 100);

        double emi = p * r * Math.pow((1+r), n) / (Math.pow(1+r, n)-1);
        double totalPayment = emi * n;
        double totalInterest = totalPayment - p;
        System.out.println("Details: \n\tTotal Principal = " + p + ", Annual Interest Rate = " + String.format("%.2f", apr) + " and Tenure = " + n);
        System.out.println("Total Payment = " + String.format("%.2f",totalPayment));
        System.out.printf("Total Interest = %.2f\n", totalInterest);
        System.out.println("EMI (in whole figure) " + Math.round(emi));
        System.out.println("EMI (truncated figure) " + (int) emi);
    }
}
