package com.soluciones.seba.busqueda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio128 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,3,4,5,6};
        
        System.out.println(Arrays.toString(arr_sin_dup(a1, a2)));
    }

    public static Integer[] arr_sin_dup (int[] a1, int[] a2){
        Set<Integer> num_set = new HashSet<>();

        for (int num1 : a1) {
            num_set.add(num1);
        }
        for (int num2 : a2) {
            num_set.add(num2);
        }

        Integer[] arr = num_set.toArray(new Integer[0]);

        return arr;    
    }
}
