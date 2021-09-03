package com.java.basic.practice1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Part7Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void out() {
        Part7.main(new String[]{});
        assertEquals("" +
                "A ==> 1 ==> A" + System.lineSeparator() +
                "B ==> 2 ==> B" + System.lineSeparator() +
                "Z ==> 26 ==> Z" + System.lineSeparator() +
                "AA ==> 27 ==> AA" + System.lineSeparator() +
                "AZ ==> 52 ==> AZ" + System.lineSeparator() +
                "BA ==> 53 ==> BA" + System.lineSeparator() +
                "ZZ ==> 702 ==> ZZ" + System.lineSeparator() +
                "AAA ==> 703 ==> AAA" + System.lineSeparator(), outContent.toString());
    }
}