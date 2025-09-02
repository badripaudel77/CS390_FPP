package edu.miu.badripaudel.lab1;

import java.util.ArrayList;

/**
 * @author Badri Paudel
 * @since 9/2/2025
 * <p>This is the assignment for lab 1, FPP course, MIU, IA</p>
 * Program name: <b>“Remove Array Duplicates”</b>
 */
public class Prog4 {
    public static void main(String[] args) {
        String[] animals = {"cat", "horse","horse", "dog", "cat", "horse", "dog", "dog", "horse"};
        ArrayList<Integer> duplicateIndexes = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            for (int j = i+1; j < animals.length; j++) {
                if(animals[i].equals(animals[j]) && !duplicateIndexes.contains(j)) {
                    duplicateIndexes.add(j);
                }
            }
        }
        String[] finalArray = new String[animals.length - duplicateIndexes.size()];
        int dI = 0;
        for (int i = 0; i < animals.length; i++) {
            if(!duplicateIndexes.contains(i)) {
                finalArray[dI++] = animals[i];
            }
        }
        for(String s: finalArray) {
            System.out.println(s + " ");
        }
    }
}
