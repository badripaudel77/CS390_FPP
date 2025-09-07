package edu.miu.lab1;

import java.util.Scanner;

/**
 * @author Badri Paudel and Khanh
 * @since 9/2/2025
 * <p>This is the assignment for lab 1, FPP course, MIU, IA</p>
 * Program name: <b>“Calculate the first N terms of the series”</b>
 */
public class FirstNTermSeries {
    public static void main(String[] args) {
        FirstNTermSeries firstNTermSeries = new FirstNTermSeries();

        firstNTermSeries.firstSeries();
        firstNTermSeries.secondSeries();
    }

    /* Question a
     * Calculate the first N terms of the series: 1 – 1/3 + 1/5 – 1/7 + 1/9 - …..
     */
    private void firstSeries() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Enter the number of terms in the series (first series): ");
        int n = scanner.nextInt();

        double sum = 0.0;
        int divi = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += (double) 1 / divi;
            }
            else {
                sum -= (double) 1 / divi;
            }
            divi += 2;
        }
        System.out.println("(first series) Sum of the series for " + n + " terms is = " + sum);
    }

    /* Question b
     * Calculate the first N terms of the series : 1/2 - 2/4 + 3/8 – 4/16 + 5/32 - …..
     */
    private void secondSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2) Enter the number of terms in the series (second series): ");
        int n = scanner.nextInt();

        double sum = 0.0;
        int divdier = 1;
        int divi = 2;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += (double) divdier / divi;
            }
            else {
                sum -= (double) divdier / divi;
            }
            divdier++;
            divi *= 2;
        }
        System.out.println("(second series) Sum of the series for " + n + " terms is = " + sum);
    }

}
