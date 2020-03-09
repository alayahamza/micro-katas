package com.katas;

import org.junit.Test;

import java.util.List;

import static com.katas.Sum.calculate;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Sum all elements of a collection
 */

public class SumTest {
    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}
