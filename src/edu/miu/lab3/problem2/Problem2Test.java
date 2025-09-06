package edu.miu.lab3.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void reverse() {
        int[] originalArr = new int[] { 1,2,3,4,5 };
        int[] expectedArr = new int[] { 5,4,3,2,1 };
        Problem2.reverse(0, 4, originalArr);
        assertArrayEquals(expectedArr, originalArr);

        int[] originalArr1 = new int[] { 1};
        int[] expectedArr1 = new int[] { 1 };
        Problem2.reverse(0, 0, originalArr1);
        assertArrayEquals(originalArr1, expectedArr1);
    }
}