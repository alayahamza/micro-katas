package com.katas;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class PeopleStats {
    public static DoubleSummaryStatistics getStats(List<Person> collection) {
        return collection.stream()
                .mapToDouble(Person::getAge)
                .summaryStatistics();
    }
}
