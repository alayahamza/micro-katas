package com.katas;

import org.junit.Test;

import java.util.List;

import static com.katas.OldestPerson.getOldestPerson;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Get oldest person from the collection
 */

public class OldestPersonTest {
    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertThat(getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
    }

}
