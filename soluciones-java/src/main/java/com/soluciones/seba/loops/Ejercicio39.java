package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingresar numero");
            int var1 = sc.nextInt();
            
            System.out.println("tabla del " + var1 + ":");

            for (int i = 0; i <= 10; i++) {
                System.out.println(var1 + " * " + i + " = " + var1*i);
            }

        }
    }
}
