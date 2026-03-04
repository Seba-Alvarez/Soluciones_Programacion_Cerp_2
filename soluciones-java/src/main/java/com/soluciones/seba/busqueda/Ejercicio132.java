package com.soluciones.seba.busqueda;

public class Ejercicio132 {
    public static void main(String[] args) {
        int suma = 0;
        int[] arr = {1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                suma += arr[i];
            }
        }

        System.out.println(suma);
    }
}
