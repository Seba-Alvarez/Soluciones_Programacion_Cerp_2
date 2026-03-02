package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Ingresar caso 1 (binario), 2 (octal) o 3 (hexadecimal)");
            int caso = sc.nextInt();
            System.out.println("Ingresar el número a convertir");
            int num = sc.nextInt();

            switch (caso) {
                case 1:
                    convertir_binario(num);
                    break;
                case 2:
                    convertir_octal(num);
                    break;
                case 3:
                    convertir_hexa(num);
                    break;
                default:
                    System.out.println("Solo 1, 2 o 3 son opciones validas");
            }
        }
    }

    public static void convertir_binario(int num){
        String numbs = Integer.toBinaryString(num);
        System.out.println("el número convertido a binario es " + numbs);
    }

    public static void convertir_octal(int num){
        String numbo = Integer.toOctalString(num);
        System.out.println("el número convertido a octal es " + numbo);
    }

    public static void convertir_hexa(int num){
        String numbh = Integer.toHexString(num);
        System.out.println("el número convertido a hexadecimal es " + numbh);
    }
}
