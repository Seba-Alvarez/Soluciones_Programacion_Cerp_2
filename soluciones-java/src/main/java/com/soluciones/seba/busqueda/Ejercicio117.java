package com.soluciones.seba.busqueda;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio117 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {4,5,6,7,8};
        System.out.println(elem_comunes(a1,a2));
    }

    public static Set<Integer> elem_comunes (int[] a1,int[] a2){
        Set<Integer> com = new HashSet<>();
        for (int i = 0; i < a1.length; i++){
            int ea1 = a1[i];
            for (int ii = 0; ii < a2.length; ii++){
                int ea2 = a2[ii];
                if (ea1 == ea2){
                    com.add(ea1);
                }
            }

        }
        return com;
    }
}