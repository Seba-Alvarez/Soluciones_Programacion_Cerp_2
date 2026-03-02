package com.soluciones.seba.funciones;

public class Ejercicio65 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("el factorial del número es: " + factorial(num));
    }

    public static int factorial (int n1){
        int n2 = 1; 
        for (int i = 1; i <= n1; i++){
                n2 = n2 * i;
            }
        return n2;
    }
}
