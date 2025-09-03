package edu.miu.badripaudel.lab1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Badri Paudel
 * @since 9/2/2025
 * <p>This is the assignment for lab 1, FPP course, MIU, IA</p>
 * Program name: <b>“Remove Array Duplicates”</b>
 */
public class Prog4 {
    public static void main(String[] args) {
        String[] animals = {"cat", "horse","horse", "dog", "cat", "horse", "dog", "dog", "horse"};
        String[] unique = new String[animals.length]; // stores the unique elements
        int uniqueCount = 0;

        for (int i = 0; i < animals.length; i++) {
            boolean isDupFound = false;
            for (int j = 0; j < animals.length; j++) {
                if(animals[i].equals(unique[j])) {
                    isDupFound = true;
                    break; // break the inner loop
                }
            }
            // check if we found the duplicate, if yes, don't add to the unique array
            if(!isDupFound) {
                unique[uniqueCount++] = animals[i];
            }
        }
        // create final array (without nulls)
        String[] finalArr = new String[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalArr[i] = unique[i];
        }

        System.out.println("Initial Array : " + Arrays.toString(animals));
        System.out.println("Final Array : " + Arrays.toString(finalArr));
    }
}
