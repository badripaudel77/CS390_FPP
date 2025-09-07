package edu.miu.lab3.problem4;

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
        if(numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        // only one item
        if(numbers.length == 1) {
            return numbers[0];
        }
        // call helper function
        return getMaxNumberRecursive(numbers, 0);
    }

    private int getMaxNumberRecursive(int[] numbers, int index) {
        // base case, when index is equal to length - 1, it is the last.
        if(index == numbers.length - 1) {
            return numbers[index];
        }
        // recursive case, increment the index to point to the next element in the array
        int restMax = getMaxNumberRecursive(numbers, index+1);
        return Math.max(restMax, numbers[index]);
    }

    public static void main(String[] args) {
        System.out.println(new Problem4().getMaxNumber(new int[] { 12, 101, 19, 1,3,4,5,66 }));
    }
}
