package com.soluciones.seba.funciones;

import java.util.ArrayList;

public class Ejercicio61 {
    public static void main(String[] args) {
        int[] lis_num = {10,10,10,10,9};
        System.out.println("el promedio del array es: " + media_ar(lis_num));
    }

    public static double media_ar (int[] med){
        int suma = 0;
        for (int i = 0; i < med.length; i++) {
            suma += med[i];            
        }
        double res = suma / med.length;
        return res;
    }

    public static double media_arl (ArrayList<Integer> med){
        int suma = 0;
        for (int num : med){
            suma += num;
        }
        double res = suma / med.size();
        return res;     
    }
}