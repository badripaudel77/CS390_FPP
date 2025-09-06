package edu.miu.lab3.problem1;

/**
 * Problem 1
 * @author Khanh Nguyen Tran
 */
public class Problem1 {
    public static void main(String[] args) {
        System.out.println(findMini("akel"));
        System.out.println(findMini("khanh"));
    }

    private static char findMini(String s) {
        if (s == null || s.isBlank())
            return (char) Integer.MAX_VALUE;
        char c = s.charAt(0);
        char next = findMini(s.substring(1));
        if (c < next) {
            return c;
        } else {
            return next;
        }
    }
}
