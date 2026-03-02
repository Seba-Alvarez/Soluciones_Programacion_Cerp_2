package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ingresar la cantidad de números a sumar");
            int n = sc.nextInt();
            System.out.println("ingresar el número inicial");
            int m = sc.nextInt();
            int suma = 0, cont = 0;

            for (int i = m; cont < n; i++) {
                if (i % 2 == 0) {
                    suma += i;
                    cont ++;
                }
            }
            System.out.println(suma);
        }
    }
}
