package com.katas;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.katas.Portioning.partitionAdults;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PartitionningTest {
    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        Map<Boolean, List<Person>> result = partitionAdults(collection);
        assertThat(result.get(true)).hasSameElementsAs(asList(viktor, eva));
        assertThat(result.get(false)).hasSameElementsAs(asList(sara));
    }

}
