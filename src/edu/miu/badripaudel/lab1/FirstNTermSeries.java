package edu.miu.badripaudel.lab1;

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

        StringBuilder series = new StringBuilder();

        double sum = 0.0;
        int divi = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += (double) 1 / divi;
                if (i != 0) {
                    series.append(" + ");
                    series.append("1/").append(divi);
                } else {
                    series.append("1");
                }
            } else {
                sum -= (double) 1 / divi;
                series.append(" - ");
                series.append("1/").append(divi);
            }
            divi += 2;
        }

        System.out.println("1) First series for " + n + " terms is : " + series + " = " + sum);

    }

    /* Question b
     * Calculate the first N terms of the series : 1/2 - 2/4 + 3/8 – 4/16 + 5/32 - …..
     */
    private void secondSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2) Enter the number of terms in the series (second series): ");
        int n = scanner.nextInt();

        StringBuilder series = new StringBuilder();

        double sum = 0.0;
        int divdier = 1;
        int divi = 2;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += (double) divdier / divi;
                if (i != 0) {
                    series.append(" + ");
                }
                series.append(divdier).append("/").append(divi);
            } else {
                sum -= (double) divdier / divi;
                series.append(" - ");
                series.append(divdier).append("/").append(divi);
            }
            divdier++;
            divi *= 2;
        }

        System.out.println("2) series for " + n + " terms is : " + series + " = " + sum);
    }

}
