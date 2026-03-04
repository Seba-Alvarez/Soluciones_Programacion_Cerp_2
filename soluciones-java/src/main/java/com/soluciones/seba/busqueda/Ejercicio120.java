package com.soluciones.seba.busqueda;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio120 {
    public static void main (String[] args){
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {4,5,6,7,8};

        System.out.println(elem_exc(a1, a2));
    }

    public static Set<Integer> elem_exc (int[] a1, int[] a2){
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();

        for (int n1 : a1) {
            num1.add(n1);            
        }
        for (int n2 : a2) {
            num2.add(n2);
        }

        Set<Integer> num1_copia = new HashSet<>(num1);
        Set<Integer> num2_copia = new HashSet<>(num2);

        num1_copia.removeAll(num2);
        num2_copia.removeAll(num1);

        num1_copia.addAll(num2);

        return num1_copia;
    }
}
