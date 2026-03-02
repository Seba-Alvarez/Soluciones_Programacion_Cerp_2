package com.soluciones.seba.funciones;

public class Ejercicio67 {
    public static void main(String[] args) {
        int num = 111;
        System.out.println("la suma es: " + suma(num));
    }

    public static int suma (int num){
        int sum = 0 ;
        while (num > 0){
            sum += num % 10;
            num /= 10; 
            }
        return sum;
    }
}
