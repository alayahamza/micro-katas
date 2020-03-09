package com.katas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static String spinWords(String words) {
        return Arrays.stream(words.split(" "))
                .map(word -> word.length() >= 5 ? new StringBuilder().append(word).reverse() : word)
                .collect(Collectors.joining(" "));
    }
}
