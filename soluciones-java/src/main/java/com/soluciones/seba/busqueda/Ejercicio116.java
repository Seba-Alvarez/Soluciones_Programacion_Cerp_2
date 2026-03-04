package com.soluciones.seba.busqueda;

import java.util.Arrays;

public class Ejercicio116 {
    public static void main(String[] args) {
        int[] m1 = {1,2,4,9};

        System.out.println(mediana(m1));
    }
    
    public static double mediana (int[] arr){
        Arrays.sort(arr);
        
        int num = arr.length;
        
        if (num % 2 == 0){
            return (arr[num/ 2 - 1] + arr[num/ 2]) / 2.0;
        }
        else {
            return arr[num/ 2];
        }
    }  
}
