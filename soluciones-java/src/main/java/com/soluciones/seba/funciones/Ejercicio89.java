package com.soluciones.seba.funciones;

public class Ejercicio89 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 3;
        mult(num1, num2);
        
    }
    public static void mult (int num1, int num2){
        int res = 0;
        for (int i = 0; i < num2; i++) {
            res += num1;            
        }
        System.out.println(res);
    }
}
