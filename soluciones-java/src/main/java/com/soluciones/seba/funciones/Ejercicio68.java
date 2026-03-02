package com.soluciones.seba.funciones;

public class Ejercicio68 {
    public static void main(String[] args){
        int num1 = 48, num2 = 18;
        System.out.println("el mcd entre " + num1 + " y " + num2 + " es " + mcd(num1, num2));
    }

    public static int mcd (int num1, int num2){
        while (num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    } 
}
