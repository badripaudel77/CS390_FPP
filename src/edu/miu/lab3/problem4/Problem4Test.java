package edu.miu.lab3.problem4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {
    static Problem4 problem4;

    @BeforeAll
    static void initObject() {
        problem4 = new Problem4();
    }
    @Test
    void getMaxNumberWhenArrayIsSorted() {
        int maxNumber = problem4.getMaxNumber(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(7, maxNumber);
    }

    @Test
    void getMaxNumberWhenArrayHasAllNegative() {
        int maxNumber = problem4.getMaxNumber(new int[]{-10, -2, -43, -44});
        assertEquals(-2, maxNumber);
    }

    @Test
    void getMaxNumberWhenArrayIsEmpty() {
        Problem4 p = new Problem4();
        assertThrows(IllegalArgumentException.class, () -> p.getMaxNumber(new int[]{}));
    }
}