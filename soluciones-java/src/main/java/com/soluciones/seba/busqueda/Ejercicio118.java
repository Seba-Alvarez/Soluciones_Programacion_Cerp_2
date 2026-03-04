package com.soluciones.seba.busqueda;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio118 {
    public static void main(String[] args) {
        char[] a1 = {'a','e','i','o',};
        char[] a2 = {'i','o','u','z',};
        System.out.println(elem_comunes(a1, a2));
    }

    public static Set<Character> elem_comunes (char[] a1, char[] a2){
        Set<Character> com = new HashSet<>();
        for (int i = 0; i < a1.length; i++){
            char ea1 = a1[i];
            for (int ii = 0; ii < a2.length; ii++){
                char ea2 = a2[ii];
                if (ea1 == ea2){
                    com.add(ea1);
                }
            }

        }
        return com;
    }
}