package com.soluciones.seba.busqueda;

public class Ejercicio112 {
    public static void main(String[] args) {
        int[] array_e = {1,2,3,4,5,6};
        

        System.out.println("la suma es " + sumar_m3(array_e));
    }

    public static int sumar_m3 (int[] lis){
        int suma = 0;

        for (int num : lis) {
            if (num % 3 == 0){
                suma += num;
            }            
        }
        return suma;
    }
}    

