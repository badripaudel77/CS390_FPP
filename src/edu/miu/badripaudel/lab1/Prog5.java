package edu.miu.badripaudel.lab1;

/**
 * @author Nguyen Khanh, Tran (ID: 619956)
 * @since 9/2/2025
 * <p>This is the assignment for lab 1, FPP course, MIU, IA</p>
 * Program name: <b>“Find Second Minimum”</b>
 */
public class Prog5 {
    public static void main(String[] args) {
        int[] input = { 20, 21, 38, 45, 0, 12, 18, 69, 39, 100, 0, 22 };
        secondMin(input);
    }

    public static void secondMin(int[] arrayOfInts){
        if (arrayOfInts == null || arrayOfInts.length == 0){
            System.out.println("Array is null or empty");
            return;
        }

        int min = arrayOfInts[0];
        int second = arrayOfInts[0];
        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < min) {
                min = arrayOfInts[i];
            }
            else if (arrayOfInts[i] < second && arrayOfInts[i] > min) {
                second = arrayOfInts[i];
            }
        }
        System.out.println("secondMin: " + second);
    }
}
