package com.soluciones.seba.busqueda;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio127 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};
        ArrayList<Integer> num_lis = new ArrayList<>();

        for (int n1 : a1) {
            num_lis.add(n1);
        }
        for (int n2 : a2) {
            num_lis.add(n2);
        }

        Collections.sort(num_lis);

        System.out.println(num_lis);
    }
}
