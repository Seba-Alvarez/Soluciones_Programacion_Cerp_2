package com.soluciones.seba.funciones;

import java.util.ArrayList;

public class Ejercicio72 {
    public static void main(String[] args) {
        int[] nums_a = {1,2,3,4};    
        System.out.println("la media geométrica es " + med_geo_arr(nums_a));
    }

    public static double med_geo_arr (int[] list){
        int num1 = 1;
        int can = list.length;

        for (int i = 0; i < list.length; i++) {
            num1 *= list[i];
        }
        double res = Math.pow(num1, 1.0 / can);
        return res;
    }

    public static double med_geo_arr_l (ArrayList<Integer> list){
        int num1 = 1;
        int can = list.size();

        for (int num : list) {
            num1 *= num;
        }

        double res = Math.pow(num1, 1.0 / can);
        return res;                
    }
}
