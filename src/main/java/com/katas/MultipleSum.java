package com.katas;

import java.util.stream.IntStream;

public class MultipleSum {
    public static int solution(int number) {
        return IntStream.range(1, number)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .reduce(0, Integer::sum);
    }
}
