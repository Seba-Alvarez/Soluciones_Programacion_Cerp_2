package com.soluciones.seba.busqueda;

import java.util.Arrays;

public class Ejercicio119 {
    public static void main(String[] args) {
        int[] a1 = {9,8,7,6,1,2,4,5};
        System.out.println(mas_largo(a1));
    }
    public static int mas_largo(int[]arr){
        Arrays.sort(arr);        
        int cont = 1;
        int max = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]){
                cont++;
            }
            else{
                cont = 1;
            }
            if (cont > max){
                max = cont;
            }
        }
        return max;
    }
}
