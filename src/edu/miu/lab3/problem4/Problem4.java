package edu.miu.lab3.problem4;

import java.util.Arrays;

/** Lab3 assignment
 * Problem 4 :
 "Write a recursive solution to return max value from the given array.
        Example: [5, -3, 6, 1, 9, 4 ], Max = 9"
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 * @author Badri Paudel
 */

public class Problem4 {

    public int getMaxNumber(int[] numbers) {
        // Empty array
        if(numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        // only one item
        if(numbers.length == 1) {
            return numbers[0];
        }
        // recursive case
        int rest = getMaxNumber(Arrays.copyOfRange(numbers, 1, numbers.length));
        return Math.max(rest, numbers[0]);
    }

    public static void main(String[] args) {
        System.out.println(new Problem4().getMaxNumber(new int[] { 1, 19, 1,3,4,5,66 }));
    }
}
