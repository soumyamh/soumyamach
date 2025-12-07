package com.soumya.persone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pessonneeTest {
    @Test
    public void testTourner1() {
        pessonnee  p = new pessonnee();
        assertEquals("EST", p.tourner(1));
    }
}