package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            System.out.println("ingresar términos");
            int n = sc.nextInt();
            double sum = 0;

            System.out.println("términos: ");

            for (int i = 1; i < n; i++) {
                double ter = 1.0/i ;
                sum += ter;
                System.out.println("1/" + i + " = " + ter);
            }

            System.out.println(sum);
        }
    }    
}
