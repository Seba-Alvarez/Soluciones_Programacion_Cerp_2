package com.soluciones.seba.busqueda;

public class Ejercicio126 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 7};
        int num = 7;
        System.out.println(prim_ocur(arr, num));
    }

    public static int prim_ocur(int[] a1, int n1){
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == n1){
                return i;
            }
        }
        return -1;
    }
}
