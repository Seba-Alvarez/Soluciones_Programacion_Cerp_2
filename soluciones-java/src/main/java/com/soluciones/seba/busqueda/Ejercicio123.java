package com.soluciones.seba.busqueda;

public class Ejercicio123 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6};

        int max = a1[0];
        int segm = a1[0];

        for (int n1 : a1) {
            if (n1 > max){
                max = n1;
            }            
        }

        for (int n2 : a1) {
            if (n2 < max && n2 > segm) { 
                segm = n2;
            }
        }

        System.out.println(max + " " +  segm);
    }
}
