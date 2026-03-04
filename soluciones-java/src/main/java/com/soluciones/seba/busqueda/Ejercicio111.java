package com.soluciones.seba.busqueda;

public class Ejercicio111 {
    public static void main(String[] args) {
        int[] num_lis = {9,8,7,6,1,2,3};
        int max = num_lis[0];
        int min = num_lis[0];

        for (int num : num_lis) {
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }

        System.out.println("minimo = " + min + " maximo = " + max);
    }   
}
