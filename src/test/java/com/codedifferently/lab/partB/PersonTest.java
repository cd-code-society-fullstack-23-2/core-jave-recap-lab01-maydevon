package com.codedifferently.lab.partB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person("John Doe", 30);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    public void testSetName() {
        person.setName("Jane Smith");
        assertEquals("Jane Smith", person.getName());
    }

    @Test
    public void testSetAge() {
        person.setAge(35);
        assertEquals(35, person.getAge());
    }

    @Test
    public void testToString() {
        assertEquals("Person [name=John Doe, age=30]", person.toString());
    }
}
