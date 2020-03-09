package com.katas;

public class MissingLetter {
    public static char findMissingLetter(char[] array) {
        char expectedLetter = array[0];
        for (char letter : array) {
            if (letter != expectedLetter) break;
            expectedLetter++;
        }
        return expectedLetter;
    }
}
