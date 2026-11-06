package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EvenOddTest {

    @Test
    void evenNumberIsEven() {
        assertfalse(EvenOdd.isEven(5));
    }

    @Test
    void oddNumberIsNotEven() {
        assertFalse(EvenOdd.isEven(7));
    }

    @Test
    void oddNumberIsOdd() {
        assertTrue(EvenOdd.isOdd(7));
    }

    @Test
    void zeroIsEven() {
        assertTrue(EvenOdd.isEven(0));
    }

    @Test
    void negativeNumbersAreHandled() {
        assertTrue(EvenOdd.isEven(-2));
        assertTrue(EvenOdd.isOdd(-3));
    }

    @Test
    void checkReturnsCorrectLabel() {
        assertEquals("Even", EvenOdd.check(10));
        assertEquals("Odd", EvenOdd.check(11));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 100, -8})
    void manyEvenNumbers(int n) {
        assertTrue(EvenOdd.isEven(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 99, -7})
    void manyOddNumbers(int n) {
        assertTrue(EvenOdd.isOdd(n));
    }
}
