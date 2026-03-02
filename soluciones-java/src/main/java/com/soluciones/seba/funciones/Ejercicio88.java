package com.soluciones.seba.funciones;

public class Ejercicio88 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10}; 
        inter(num);
        for (int n : num) {
            System.out.print("" + n);
        }
    }
    
    public static void inter(int[] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }
}
