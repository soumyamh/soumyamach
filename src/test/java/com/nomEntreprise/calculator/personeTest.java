package com.nomEntreprise.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class personeTest {
    @Test
    public void testTournerUneFois() {
        persone p;
        p = new persone();
        assertEquals("EST", p.tourner(1));
    }


}