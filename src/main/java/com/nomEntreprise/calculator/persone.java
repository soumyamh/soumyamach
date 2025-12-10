package com.nomEntreprise.calculator;

public class persone {


        private String[] orientations = {"NORD", "EST", "SUD", "OUEST"};
        private int indexOrientation = 0; // NORD au début

        public String tourner(int fois) {
            indexOrientation = (indexOrientation + fois) % 4;
            return orientations[indexOrientation];
        }
    }


