package com.soluciones.seba.funciones;

import java.util.ArrayList;

public class Ejercicio62 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println("la suma de los números pares es: " + suma_par_ar(nums));
    }

    public static int suma_par_ar (int[] med){
        int suma = 0;
        for (int i = 0; i < med.length; i++) {
            if (med[i] % 2 == 0){
                suma += med[i];
            }            
        }
        int res = suma;
        return res;
    }

    public static int suma_par_arl (ArrayList<Integer> med){
        int suma = 0;
        for (int num : med){
            if (num % 2 == 0){
                suma += num;
            }
        }
        int res = suma;
        return res;     
    }
}
