package com.katas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {
    public static void main(String[] args) {
        double cutVal = 0.5;
        List<Double> doubles = produceList(6);
        doubles.forEach(System.out::println);
        System.out.println("avg : " + average(doubles));
        System.out.println("cutVal : " + cutVal);
        List<Double> doublesCutOff = cutOff(doubles, cutVal);
        doublesCutOff.forEach(System.out::println);
    }

    public static List<Double> produceList(Integer size) {
        return IntStream.rangeClosed(1, size)
                .mapToObj(i -> Math.random())
                .collect(Collectors.toList());
    }

    public static Double average(List<Double> list) {
        return list.stream()
                .mapToDouble(Double::valueOf)
                .summaryStatistics()
                .getAverage();
    }

    public static List<Double> cutOff(List<Double> list, Double cutValue) {
        return list.stream()
                .filter(d -> d > cutValue)
                .collect(Collectors.toList());
    }
}
