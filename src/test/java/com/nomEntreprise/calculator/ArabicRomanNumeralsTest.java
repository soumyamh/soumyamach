package com.nomEntreprise.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArabicRomanNumeralsTest {


            @Test
            public void testRomain1_50() {
                String[] attendu = {
                        "I","II","III","IV","V","VI","VII","VIII","IX","X",
                        "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                        "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                        "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                        "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L"
                };

                String[] romain = ArabicRomanNumerals.convertir(); // méthode à créer dans ta classe

                assertEquals(50, romain.length, "Le tableau doit contenir 50 éléments");

                for (int i = 0; i < 50; i++) {
                    assertEquals(attendu[i], romain[i], "Erreur à l'indice " + i);
                }
            }
        }



