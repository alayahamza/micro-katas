package com.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, CountVowels.getCount("abracadabra"));
    }
}
