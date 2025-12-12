package com.nomEntreprise.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArabicRomanNumeralsTest {


            @Test
            public void testRomain1_50() {
                int i = 0;
                String[] romain = ArabicRomanNumerals.convertir(i);
                for(i=1;i<=50;i++) {
                 assertEquals(i,ArabicRomanNumerals.convertir(i));
                }
                }
            }