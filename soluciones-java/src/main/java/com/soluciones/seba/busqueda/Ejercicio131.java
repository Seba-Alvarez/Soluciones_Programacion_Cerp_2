package com.soluciones.seba.busqueda;

import java.util.Arrays;

public class Ejercicio131 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int num = 2;
        System.out.println(subca(arr, num));
    }

    public static String subca (int[] arr, int num){
        int nl = arr.length - num;
        int[] sub = new int[nl];

        for (int i = num; i < arr.length; i++) {
            sub[i-num] = arr[i];         
        }

        String sarr1 = Arrays.toString(sub);
        return sarr1;
    }
}
