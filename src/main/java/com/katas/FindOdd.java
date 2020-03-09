package com.katas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] array) {
        List<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toList());
        for (int i : array) {
            if (collect.stream().filter(val -> val == i).count() % 2 != 0) {
                return i;
            }
        }
        return 0;
    }
}
