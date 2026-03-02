package com.soluciones.seba.funciones;

import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ingresar radio del círculo");
            double rad = sc.nextDouble();

            System.out.println("el área del círculo es:" + area(rad));
        }
    }
    
    public static double area (double rad){
        double res = Math.PI * (rad * rad);
        return res;
    }
}