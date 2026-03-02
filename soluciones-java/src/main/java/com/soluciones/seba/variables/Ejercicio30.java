package com.soluciones.seba.variables;

import java.util.Scanner;

public class Ejercicio30 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresar la cantidad de números impares");
        int var1 = scanner.nextInt();
        System.out.println("ingresar la cantidad de números pares");
        int var2 = scanner.nextInt();

        int sumi = var1 * var1;
        int sump = var2 * (var2 + 1);

        System.out.println("números impares son " + sumi + " y los números impares son " + sump);
        scanner.close();
    }    
}
