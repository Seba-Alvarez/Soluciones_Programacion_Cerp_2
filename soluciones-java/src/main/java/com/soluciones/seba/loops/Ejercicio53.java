package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (a > 0 && b > 0 && (a + b) < 180){
                double c = 180 - (a + b);
                System.out.println("el tercer ángulo es: " + c);
            }
            else {
                System.out.println("no se cumplen las condiciones para formar un triángulo");
            }

        }
    }
}
