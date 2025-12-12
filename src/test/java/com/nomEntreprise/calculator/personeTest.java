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
    @Test
    public void testTournerDeuxFois() {
        persone p = new persone();
        assertEquals("SUD", p.tourner(2));
    }
    @Test
    public void testTournerTroisFois() {
        persone p = new persone();
        assertEquals("OUEST", p.tourner(3));
    }
    @Test
    public void testTournerQuatreFois() {
        persone p = new persone();
        assertEquals("NORD", p.tourner(4));
    }








}