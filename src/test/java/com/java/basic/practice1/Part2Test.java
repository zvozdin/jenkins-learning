package com.java.basic.practice1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Part2Test {

    @Test
    public void shouldPrintSumIfTwoPositive() {
        int actual = Part2.getResult(new String[]{"1", "2"});

        assertEquals(3, actual);
    }

    @Test
    public void shouldPrintSumIfTwoNegative() {
        int actual = Part2.getResult(new String[]{"-1", "-2"});

        assertEquals(-3, actual);
    }

    @Test
    public void shouldPrintSumIfOnePositiveOneNegative() {
        int actual = Part2.getResult(new String[]{"-1", "2"});

        assertEquals(1, actual);
    }
}