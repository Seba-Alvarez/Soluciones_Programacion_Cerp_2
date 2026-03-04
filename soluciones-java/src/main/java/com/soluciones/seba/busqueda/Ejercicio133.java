package com.soluciones.seba.busqueda;

public class Ejercicio133 {
    public static void main(String[] args) {
        int mult = 1;
        int[] arr = {1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0){
                mult *= arr[i];
            }
        }

        System.out.println(mult);
    }
}
