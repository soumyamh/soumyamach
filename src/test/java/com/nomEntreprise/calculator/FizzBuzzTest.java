package com.nomEntreprise.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.de(15));
    }



    @Test
        void testNumber() {
            assertEquals("2", FizzBuzz.de(2));
        }
    }


