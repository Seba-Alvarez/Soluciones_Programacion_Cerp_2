package com.soluciones.seba.funciones;

public class Ejercicio85 {
    public static void main(String[] args) {
        int num = 20;
        System.out.println("la cantida de divisores es " + num_div(num));        
    }

    public static int num_div(int num){
        int cant = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                cant++;
            }
        }
        return cant;
    }
}
