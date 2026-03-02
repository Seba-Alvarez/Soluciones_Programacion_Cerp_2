package com.soluciones.seba.funciones;

public class Ejercicio64 {
    public static void main(String[] args) {
        String nam = "Bas";
        String fna = "Rutten";
        System.out.println("Uno de los mejores artistas marciales se llama " + concatenar(nam, fna));        
    }

    public static String concatenar (String p1, String p2){
        String conc = p1 + " " + p2;
        return conc;
    }
}
