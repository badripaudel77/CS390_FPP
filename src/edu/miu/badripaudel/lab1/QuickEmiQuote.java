package edu.miu.badripaudel.lab1;

import java.util.Random;

/**
 * @author Badri Paudel
 * @since 9/1/2025
 * <p>This is the assignment for lab 1, FPP course, MIU, IA</p>
 * Program name: <b>“Quick EMI Quote Calculator”</b>
 */
public class QuickEmiQuote {
    int principalAmount;
    int tenure;
    double yearlyInterestRate;

    Random random;

    public QuickEmiQuote() {
        random = new Random();
    }

    private void calculateEmi() {
        int p = getPrincipalAmount(5000, 25000);
        double apr = getYearlyInterestRate(3.5, 11.5);
        int n = getTenure(6, 36);
        // monthly interest rate, r
        double r = apr / (12 * 100);

        double emi = p * r * Math.pow((1+r), n) / (Math.pow(1+r, n)-1);
        double totalPayment = emi * n;
        double totalInterest = totalPayment - p;
        System.out.println("Total Principal = " + p + ", Annual Interest Rate = " + String.format("%.2f", apr) + " and Tenure = " + n);
        System.out.println("Total Payment = " + String.format("%.2f",totalPayment));
        System.out.printf("Total Interest = %.2f\n", totalInterest);
        System.out.println("EMI (in whole figure) " + Math.round(emi));
        System.out.println("Emit (truncated figure) " + (int) emi);
    }

    private int getPrincipalAmount(int lower, int upper) {
        principalAmount = random.nextInt(lower, upper+1);
        return principalAmount;
    }

    private int getTenure(int lower, int upper) {
        tenure = random.nextInt(lower, upper+1);
        return tenure;
    }

    private double getYearlyInterestRate(double lower, double upper) {
        yearlyInterestRate = lower + (upper - lower) * Math.random(); //Khanh - fixed random double
        return yearlyInterestRate;
    }

    public static void main(String[] args) {
        QuickEmiQuote quickEmiQuote = new QuickEmiQuote();
        quickEmiQuote.calculateEmi();
    }
}
