package com.java.basic.practice1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Part3Test {

    @Test
    public void shouldPrintCommandLineArguments() {
        String actual = Part3.getResult(new String[]{"1", "2", "asd", "sad"});

        assertEquals("1 2 asd sad", actual);
    }
}