package edu.miu.lab3.problem3;

/** Lab3 assignment
 * Problem 3 :
     "Write a recursive solution to check whether the given number is Palindrome or not.You can
     have public utility method and private a recursive method. Return a boolean value. Do not
     convert your input to String. Solve it as only using int type to check a Palindrome number."
    <pre>
         Example: If you input an int value 121 – return true
         If your input is negative return false.
         If the input is 102 return false
    </pre>
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 * @author Badri Paudel
 */

public class Problem3 {
    public static boolean checkIfPalindromeUsingRecursion(int number ) {
        // Negative number
        if(number < 0) {
            return false;
        }
        // Single digit number is always palindrome.
        if(number < 10) {
            return true;
        }
        int reversedNumber = reverse(number, 0);
        return reversedNumber == number;
    }

    public static int reverse(int number, int sum) {
        // if number is now 0, return the calculated sum (temporary sum calculated)
        if(number <= 0) {
            return sum;
        }
        sum = (sum * 10) + (number % 10);
        return reverse(number / 10, sum);
    }

    public static void main(String[] args) {
        boolean palindrome = checkIfPalindromeUsingRecursion(3336);
        System.out.println("is palindrome " + palindrome);
    }
}
