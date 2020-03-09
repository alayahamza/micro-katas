package com.katas;

import org.junit.Test;

import java.util.List;

import static com.katas.ToUpperCase.transform;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Convert elements of a collection to upper case.
 */

public class ToUpperCaseTest {
    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }
}
