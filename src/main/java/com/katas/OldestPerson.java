package com.katas;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {
    public static Person getOldestPerson(List<Person> collection) {
        return collection.stream()
                .max(Comparator.comparing(Person::getAge))
                .get();
    }
}
