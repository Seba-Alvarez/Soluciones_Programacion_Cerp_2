package com.soluciones.seba.funciones;

public class Ejercicio87 {
    public static void main (String[] args){
        int n = 10;
        System.out.println("el término solicitado es: " + fibo(n));
    }

    public static int fibo (int n){ 
        switch (n) {
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return fibo(n-1) + fibo(n-2);
        }
    }
}