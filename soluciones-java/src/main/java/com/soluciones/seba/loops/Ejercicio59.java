package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio59 {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Ingresar precio original");
            int ogp = sc.nextInt();
            System.out.println("Ingresar A, B o C para el aumento (10, 20 y 30 respectivamente)");
            String au = sc.next();
            switch (au){
                case "A":
                    System.out.println("Precio con aumento" + (ogp * 1.10));
                    break;
                case "a":
                    System.out.println("Precio con aumento" + (ogp * 1.10));
                    break;
                case "B":
                    System.out.println("Precio con aumento" + (ogp * 1.20));
                    break;
                case "b":
                    System.out.println("Precio con aumento" + (ogp * 1.20));
                    break;
                case "C":
                    System.out.println("Precio con aumento" + (ogp * 1.30));
                    break;
                case "c":
                    System.out.println("Precio con aumento" + (ogp * 1.30));
                    break;
                default:
                    System.out.println("Invalido, solo A,B o C");
            }
        }
    }
}