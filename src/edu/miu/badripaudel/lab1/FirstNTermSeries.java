package edu.miu.badripaudel.lab1;

import java.util.Scanner;

/**
 * @author Badri Paudel
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
        int first = 1;
        int second = 3;
        int third = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series (first series): ");
        int n = scanner.nextInt();

        StringBuilder series = new StringBuilder();
        series.append("1/").append(first).append(" ")
                .append("- 1/").append(second).append(" ");

        for(int i = 0; i < n-2; i++) {
            third = second + 2;
            second = third;
            if(i % 2 == 0) {
                series.append("+ 1/")
                        .append(third).append(" ");
            }
            else {
                series.append("- 1/")
                        .append(third).append(" ");
            }
        }
        System.out.println("Final series for " + n + " terms is : " + series);
    }

    /* Question b
     * Calculate the first N terms of the series : 1/2 - 2/4 + 3/8 – 4/16 + 5/32 - …..
     */
     private void secondSeries() {
        int first = 2;
        int second = 4;
        int third = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series (second series): ");
        int n = scanner.nextInt();
        StringBuilder series = new StringBuilder();

        series.append("1/").append(first).append(" ")
                .append("- 1/").append(second).append(" ");

        for(int i = 0; i < n-2; i++) {
            third = second * 2;
            second = third;
            if(i % 2 == 0) {
                series.append("+ 1/")
                        .append(third).append(" ");
            }
            else {
                series.append("- 1/")
                        .append(third).append(" ");
            }
        }
        System.out.println("Final series for " + n + " terms is : " + series);
    }

}
