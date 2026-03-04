package com.soluciones.seba.busqueda;

public class Ejercicio121 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6};
        int suma = 0;

        for (int n1 : a1) {
            suma += n1;
        }

        double med = (double) suma / a1.length;
        System.out.println(med);
    }
}