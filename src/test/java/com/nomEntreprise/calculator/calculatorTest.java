package com.nomEntreprise.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

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