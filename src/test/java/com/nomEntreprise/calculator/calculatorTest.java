package com.nomEntreprise.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    private calculatorTest calc;

    @BeforeEach
    void setUp() {
        calc = new calculatorTest();
        System.out.println("Initialisation...");
    }
    @AfterEach
    void tearDown() {
        System.out.println("Nettoyage après le test...");

    }


    @Test
    public void testAdd() {
        calculator  c = new calculator ();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    public void testDivide() {
        calculator   c = new calculator ();
        assertEquals(2, c.divide(10, 5));
    }
}