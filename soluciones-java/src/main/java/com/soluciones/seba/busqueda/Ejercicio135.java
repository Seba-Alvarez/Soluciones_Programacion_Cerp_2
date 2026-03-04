package com.soluciones.seba.busqueda;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio135 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,5,5,6};
        System.out.println(elem_uni(arr));
    }

    public static Set<Integer> elem_uni(int[] arr) {
    Set<Integer> nums = new HashSet<>();
    for (int num : arr) {
        nums.add(num);
    }
    return nums;
    }
}
