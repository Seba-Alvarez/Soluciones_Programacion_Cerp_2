package com.soluciones.seba.funciones;

import java.util.ArrayList;

public class Ejercicio86 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(per_num(num));
    }

    public static ArrayList<Integer> per_num (int num){
        ArrayList<Integer> lis = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int ii = 1; ii < i; ii++) {
                if (i % ii == 0){
                    sum += ii;
                }
            }
            if (sum == i){
            lis.add(i);
            } 
        }
        return lis;
    }
}
