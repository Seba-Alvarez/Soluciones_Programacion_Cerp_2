package com.soluciones.seba.funciones;

public class Ejercicio71 {
    public static void main(String[] args) {
        int num1 = -123;
        int num2 = 123;
        System.out.println("el valor absoluto de " + num1 + " es " + valor_ab(num1));
        System.out.println("el valor absoluto de " + num2 + " es " + valor_ab(num2));        
    }

    public static int valor_ab (int num1) {
        if(num1 < 0){
            num1 = num1 * -1;
        }
        return num1;
    }
    
}
