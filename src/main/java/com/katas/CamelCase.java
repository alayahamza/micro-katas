package com.katas;

import java.util.stream.Stream;

public class CamelCase {
    public static String camelCase(String str) {
        return Stream.of(str.split(" "))
                .filter(s -> !s.equals(""))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce((a, b) -> a + b)
                .orElse("");
    }
}
