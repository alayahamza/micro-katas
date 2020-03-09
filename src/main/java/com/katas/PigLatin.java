package com.katas;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {
    public static String pigIt(String str) {
        return Stream.of(str.split(" "))
                .filter(s -> s.length() > 1)
                .map(s -> s.substring(1) + s.charAt(0) + "ay")
                .collect(Collectors.joining(" "));
    }
}
