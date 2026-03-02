package com.soluciones.seba.variables;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingresar número");
            int var1 = sc.nextInt();
            int suma = 0 ;

            while (var1 > 0){
                suma += var1 % 10;
                var1 /= 10; 
            }

            System.out.println("la suma de los dígitos es " + suma);
        }
    }    
}
