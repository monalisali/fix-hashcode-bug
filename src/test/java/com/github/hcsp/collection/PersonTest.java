package com.github.hcsp.collection;

import java.util.HashSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testEquals() {
//        Assertions.assertEquals(new Person("1"), new Person("1"));
//        Assertions.assertNotEquals(new Person("1"), new Person("2"));
//
//        Person person = new Person("1");
//        person.setAge(20);
//        Assertions.assertEquals(person, new Person("1"));

        Assertions.assertEquals(new Person("1"), new Person("1")); //pass
        Assertions.assertNotEquals(new Person("1"), new Person("2"));//pass

        Person person = new Person("1");
        person.setAge(20);
        Assertions.assertEquals(person,new Person("1"));//failed: 因为Age不相等
        Assertions.assertEquals(person, new Person("1",null,20)); //pass
        Assertions.assertEquals(new Person("1","",20), new Person("1","",20));//pass

    }

    @Test
    public void testContains() {
        Person person = new Person("1");
        HashSet<Person> set = new HashSet<>();
        set.add(person);

        Assertions.assertTrue(set.contains(person));
        person.setName("张三");
        Assertions.assertTrue(set.contains(person));
    }
}
