package com.soluciones.seba.enums;

public class Ejercicio96 {
    public static void main(String[] args) {
        System.out.println(nom_col(Colores.ROJO));
    }

    public enum Colores {
        ROJO,
        AZUL,
        AMARILLO,
        NARANJA,
        VIOLETA,
        VERDE
    }

    public static String nom_col (Colores color) {
        return color.name();
    }
}
