package edu.miu.lab3.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {
    @Test
    public void testFindMinimumCharacterInString() {
        char result1 = Problem1.findMini("john");
        assertEquals('h', result1);

        char result2 = Problem1.findMini("user");
        assertEquals('e', result2);

        char result3 = Problem1.findMini("akel");
        assertEquals('a', result3);

        char result4 = Problem1.findMini("lopi");
        assertEquals('i', result4);

        // char result5 = Problem1.findMini("");
        // assertEquals((char) 0x7fffffff, result5);
    }
}