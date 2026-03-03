package com.soluciones.seba.enums;

public class Ejercicio94 {
    enum DireccionesCardinales {
        NORTE, 
        SUR, 
        ESTE, 
        OESTE, 
        NORESTE, 
        NOROESTE, 
        SURESTE, 
        SUROESTE
    }

    public static void main(String[] args) {
        DireccionesCardinales norte = DireccionesCardinales.NORTE;
        System.out.println("la osa mayor está al " + norte);
    }
}
