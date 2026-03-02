package com.soluciones.seba.funciones;

public class Ejercicio63 {
    public static void main(String[] args) {
        int[] m1 = {1,1,1};
        int[] m2 = {1,1,1};
        System.out.println("la suma de las matrices es: " + prod_pun(m1, m2));        
    }

    public static int prod_pun (int[] lis_1, int[] lis_2){
        if (lis_1.length != lis_2.length){
            System.out.println("los tamaños tienen que coincidir, aparentemente");
        }
        int suma = 0;

        for (int i = 0; i < lis_1.length; i++) {
            suma = lis_1[i] * lis_2[i];            
        }
        return suma;
    }
}