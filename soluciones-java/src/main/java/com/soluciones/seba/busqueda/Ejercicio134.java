package com.soluciones.seba.busqueda;

public class Ejercicio134 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println("la suma es " + sumar(arr));
    }

    public static int sumar (int[] arr){
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }

        return suma;
    }
}
