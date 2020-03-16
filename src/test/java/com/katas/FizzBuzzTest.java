package com.katas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void should_print_for_all() {
        FizzBuzz.main(new String[]{});
        assertEquals("12FizzFizz4BuzzBuzz", outContent.toString());
    }

    @Test
    public void should_return_Fizz_when_printFor_6() {
        assertEquals("Fizz", FizzBuzz.printFor(6));
    }

    @Test
    public void should_return_Buzz_when_printFor_5() {
        assertEquals("BuzzBuzz", FizzBuzz.printFor(5));
    }

    @Test
    public void should_return_FizzBuzz_when_printFor_15() {
        assertEquals("FizzBuzzBuzz", FizzBuzz.printFor(15));
    }

    @Test
    public void should_print_FizzFizz_when_number_contains_3() {
        assertEquals("FizzFizz", FizzBuzz.printFor(3));
    }

    @Test
    public void should_print_FizzFizz_when_number_contains_5() {
        assertEquals("BuzzBuzz", FizzBuzz.printFor(5));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
