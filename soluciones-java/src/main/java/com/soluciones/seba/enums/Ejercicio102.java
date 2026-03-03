package com.soluciones.seba.enums;

public class Ejercicio102 {
    public static void main(String[] args) {
        System.out.println(saludo(Idiomas.LATIN));
    }

    public enum Idiomas{
        LATIN,
        ARAMEO,
        NORDICO,
        MANDARIN;
    }

    public static String saludo (Idiomas greet){
        switch (greet){
            case LATIN:
                return ("Salve");
            case ARAMEO:
                return ("Shalma");
            case NORDICO:
                return ("Heill");
            case MANDARIN:
                return ("Ni hao");
            default:
                return ("Idioma no contemplado");
        }
    }
}