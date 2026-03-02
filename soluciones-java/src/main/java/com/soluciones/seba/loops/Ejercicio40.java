package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingresar número");
            int var1 = sc.nextInt(); 
            int var2 = 1;
        
            for (int i = 1; i <= var1; i++){
                var2 = var2 * i;
            }

            System.out.println("el factorial de: " + var1 + " es: " + var2);}
       
    }
}
