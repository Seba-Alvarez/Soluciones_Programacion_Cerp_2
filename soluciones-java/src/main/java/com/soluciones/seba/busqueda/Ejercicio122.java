package com.soluciones.seba.busqueda;

public class Ejercicio122 {
    public static void main(String[] args) {
        char[] a1 = {'a','b','a','c','d','a','b'};
        char l1 = 'a';

        System.out.println(l1 + " aparece " + cont_char(a1, l1) + " veces");
    }

    public static int cont_char (char[] a1, char l1){
        int cont = 0;
        for (char c1 : a1) {
            if (c1 == l1){
                cont++;
            } 
        }
        return cont;
    }
}
