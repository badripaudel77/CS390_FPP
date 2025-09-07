package edu.miu.lab3.problem2;

import java.util.Arrays;

/** Lab3 assignment
 * Problem 2 :
 * Write a recursive solution for reversing the given n elements of an array. Do not use
 * auxiliary array to store the results. Work only with the given array to reverse.
 * Example:
 * <pre>
 *     Before Reverse: [1, 3, 5, 7, 9, 13]
 *     After Reverse: [13, 9, 7, 5, 3, 1]
 * </pre>
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 * @author Khanh Nguyen Tran
 */

public class Problem2 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 13};
        System.out.println("Before Reversing : " + Arrays.toString(arr));
        reverse(0, arr.length - 1, arr);
        System.out.println("After Reversing : " + Arrays.toString(arr));
    }

    public static void reverse(int left, int right, int[] arr) {
            if(left >= right) {
                return;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverse(left+1, right-1, arr);
    }
}
