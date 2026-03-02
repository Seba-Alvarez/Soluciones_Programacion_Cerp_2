package com.soluciones.seba.funciones;

public class Ejercicio76 {
    public static void main(String[] args) {
        String cad = "hola como estas";
        System.out.println(sin_espacio(cad));
    }

    public static String sin_espacio (String cad){
        String rep = cad.replace(" ", "");
        return rep;
    }
}
