package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTestSuite {

    private Person person;

    @BeforeEach
    public void setUp() {
        // Przygotowanie danych testowych
        person = new Person(1.75, 70); // Wzrost 1.75 metra, waga 70 kilogramów
    }

    @Test
    public void testVerySeverelyUnderweight() {
        person = new Person(1.75, 30); // Bardzo poważnie niedowaga
        assertEquals("Very severely underweight", person.getBMI());
    }

    @Test
    public void testSeverelyUnderweight() {
        person = new Person(1.75, 40); // Poważna niedowaga
        assertEquals("Severely underweight", person.getBMI());
    }

    @Test
    public void testUnderweight() {
        person = new Person(1.75, 50); // Niedowaga
        assertEquals("Underweight", person.getBMI());
    }

    @Test
    public void testNormalWeight() {
        assertEquals("Normal (healthy weight)", person.getBMI());
    }


    @Test
    public void testOverweight() {
        person = new Person(1.75, 85); // Nadwaga
        assertEquals("Overweight", person.getBMI());
    }

    @Test
    public void testObeseClassI() {
        person = new Person(1.75, 95); // Otyłość Klasy I
        assertEquals("Obese Class I (Moderately obese)", person.getBMI());
    }

    @Test
    public void testObeseClassII() {
        person = new Person(1.75, 110); // Otyłość Klasy II
        assertEquals("Obese Class II (Severely obese)", person.getBMI());
    }

    @Test
    public void testObeseClassIII() {
        person = new Person(1.75, 125); // Otyłość Klasy III
        assertEquals("Obese Class III (Very severely obese)", person.getBMI());
    }

    @Test
    public void testObeseClassIV() {
        person = new Person(1.75, 140); // Otyłość Klasy IV
        assertEquals("Obese Class IV (Morbidly Obese)", person.getBMI());
    }

    @Test
    public void testObeseClassV() {
        person = new Person(1.75, 155); // Otyłość Klasy V
        assertEquals("Obese Class V (Super Obese)", person.getBMI());
    }

    @Test
    public void testObeseClassVI() {
        person = new Person(1.75, 170); // Otyłość Klasy VI
        assertEquals("Obese Class VI (Hyper Obese)", person.getBMI());
    }
}
