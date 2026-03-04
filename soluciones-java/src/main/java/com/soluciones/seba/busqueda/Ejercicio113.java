package com.soluciones.seba.busqueda;

public class Ejercicio113 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int num = 3;
        
        System.out.println("Los primeros " + num + " elementos son: ");
        pri_ele(arr, num);
    }

    public static void pri_ele (int[] arr, int num){
        if (num > arr.length){
            System.out.println("el numero ingresado es mayor al rango del array");
        }
        else {
            for (int i = 0; i < num; i++) {
            int nums = arr[i];
            System.out.print(nums + " ");
            }
        }
        System.out.println();
    }    
}
