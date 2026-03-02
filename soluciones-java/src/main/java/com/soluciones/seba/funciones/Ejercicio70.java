package com.soluciones.seba.funciones;

public class Ejercicio70 {
    public static void main(String[] args) {
        int num1 = 1234;
        System.out.println("el reverso de: " + num1 + " es: " + reverso(num1));
    }

    public static int reverso (int num1){
        int num2 = 0;
        while (num1 != 0){
            int res = num1 % 10;
            num2 = num2 * 10 + res;
            num1 /= 10;
        }
        return num2;
    }
    
}
