package com.soluciones.seba.funciones;

import java.util.ArrayList;

public class Ejercicio78 {
    public static void main (String[] args){
        int[] num_lis = {1,2,3,4,5};
        System.out.println(med_arm_arr(num_lis));
    }

    public static double med_arm_arr (int[] num_lis){
        double sum = 0;
        for (int i = 0; i < num_lis.length; i++) {
            sum += 1.0 / num_lis[i];
        }
        double res = num_lis.length / sum;
        return res;
    }

    public static double med_arm_arl (ArrayList<Integer> num_lis){
        double sum = 0;
        for (int i = 0; i < num_lis.size(); i++) {
            sum += 1.0 / num_lis.get(i);
        }
        double res = num_lis.size() / sum;
        return res;
    }
}