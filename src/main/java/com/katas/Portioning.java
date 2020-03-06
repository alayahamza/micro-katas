package com.katas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Portioning {
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> collection) {
        return collection.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() >= 18));
    }
}
