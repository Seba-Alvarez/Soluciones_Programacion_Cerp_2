package com.soluciones.seba.variables;

import java.util.Scanner;

public class Ejercicio26 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresar número");
        double var1 = scanner.nextDouble();
        
        int var2 = 1;
       
        for (int i = 1; i <= var1; i++){
            var2 = var2 * i;
        }

        System.out.println("el factorial de: " + var1 + " es: " + var2);
     
        scanner.close();
    }    
}
