package edu.miu.lab3.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void checkIfPalindromeUsingRecursion() {
        boolean actualTrue = Problem3.checkIfPalindromeUsingRecursion(121);
        assertTrue(actualTrue);

        boolean actualFalse = Problem3.checkIfPalindromeUsingRecursion(122);
        assertFalse(actualFalse);

        boolean singleActualTrue = Problem3.checkIfPalindromeUsingRecursion(1);
        assertTrue(singleActualTrue);

        boolean negativeActualFalse = Problem3.checkIfPalindromeUsingRecursion(-1);
        assertFalse(negativeActualFalse);

        boolean zeroActualTrue = Problem3.checkIfPalindromeUsingRecursion(0);
        assertTrue(zeroActualTrue);
    }
}