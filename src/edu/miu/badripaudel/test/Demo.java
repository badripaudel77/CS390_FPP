package edu.miu.badripaudel.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.random.RandomGenerator;

/**
 * @Author Badri Paudel
 * @Since 9/1/2025
 * Fundamental of Programming (FPP @MIU)
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        float x = 2.3456f;
        float y = 5.4193f;
        double x1 = 2.3456;
        double y1 = 5.4193;

        System.out.println("x * y = " +  x * y);
        System.out.println("x1 * y1 = " + x1 * y1);

        double a= 0.7;
        double b = 0.9;
        double s1 = a + 0.1;
        double s2 = b - 0.1;
        // when comparing double / float , there is precision issue and comparing with == will fail
        // it will be bit by bit comparison, so it will fail if bit differs even at the last position
        System.out.println("s1 & s2 " + s1 + " " + s2);
        System.out.println(s1==s2);

        System.out.println("\"\\t\"");

        System.out.println(Character.isJavaIdentifierStart('_'));

        /**
         *        Scanner scanner = new Scanner(System.in);
         *         Scanner scanner1 = new Scanner(System.in);
         *         System.out.println("enter the number or single word");
         *         Object obj = scanner.next(); // for single word
         *         System.out.println("enter commands (more words)");
         *         String s = scanner1.nextLine(); // for single word
         *         System.out.println("entered string is " + s);
         */

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
//        int read = br.read(); // read for a single character and return its ascii
        String s = br.readLine();// read for string (lines)
//        System.out.println("read = " + (char)read);

        System.out.println("s = " + s);
        // greatest amongst three numbers
        int a1;
        int b1;
        int c1;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        a1 = sc.nextInt();

        System.out.println("enter second number");
        b1 = sc.nextInt();

        System.out.println("enter third number");
        c1 = sc.nextInt();
        int max = (a1 > b1 && a1 > c1) ? a1
                : (b1 > c1 && b1 > a1) ? b1: c1;
        System.out.println("max = " + max);

        RandomGenerator rg = RandomGenerator.getDefault();
        System.out.println(rg);
    }
}
