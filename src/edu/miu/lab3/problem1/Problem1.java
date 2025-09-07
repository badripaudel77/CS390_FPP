package edu.miu.lab3.problem1;

/** Lab3 assignment
 * Problem 1 : Using recursion, find the minimum character in the given string input.
 * <br>
 * If your input is “akel” in return ‘a’
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 * @author Khanh Nguyen Tran
 */
public class Problem1 {
    public static void main(String[] args) {
        System.out.println(findMini("akel"));
        System.out.println(findMini("khanh"));
    }

    public static char findMini(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty");
        }
        if (s.length() == 1) {
            return s.charAt(0);
        }
        char c = s.charAt(0);
        char next = findMini(s.substring(1));
        if (c < next) {
            return c;
        } else {
            return next;
        }
    }
}
