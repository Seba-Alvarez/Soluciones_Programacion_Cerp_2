package com.soluciones.seba.funciones;

public class Ejercicio69 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 10, n3 = 12;
        System.out.println("el área del triángulo es: " + area_t(n1, n2, n3));
        
    }

    public static double area_t (int num1, int num2, int num3) {
        double sp = (num1 + num2 + num3) / 2.0;
        double ar = Math.sqrt(sp * (sp - num1) * (sp - num2) * (sp - num3));
        return ar;
    }
}
