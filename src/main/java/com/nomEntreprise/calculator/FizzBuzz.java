package com.nomEntreprise.calculator;

public class FizzBuzz {



        public static String de(int n) {
            if (n % 15 == 0) {
                return "FizzBuzz";
            }
            if (n % 3 == 0) {
                return "Fizz";
            }
            if (n % 5 == 0) {
                return "Buzz";
            }

            return String.valueOf(n);
        }

    }


