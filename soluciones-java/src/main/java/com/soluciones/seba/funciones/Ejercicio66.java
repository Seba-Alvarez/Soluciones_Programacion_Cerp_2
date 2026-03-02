package com.soluciones.seba.funciones;

public class Ejercicio66 {
    public static void main(String[] args) {
        String cad = "supercalifragilisticoespalidoso";
        System.out.println(invertir(cad));
    }

    public static String invertir (String cad){
        String res = " ";
        for (char c : cad.toCharArray()) {
            res = c + res;             
        }
        return res;
    }
}
