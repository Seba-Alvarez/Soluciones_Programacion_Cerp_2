package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ingresar cantidad de números");
            int can = sc.nextInt();
            
            System.out.println("ingresar el primer número");
            int pnum = sc.nextInt();
            int may = pnum;
            int men = pnum;
            System.out.println("prosiga");

            for (int i = 1; i < can; i++) {
                int num = sc.nextInt();
                if (num >= may) {
                    may = num;
                }
                if (num <= men) {
                    men = num;
                }
            }

            System.out.println("el mayor número es " + may + " mientras que el menor es " + men);
        }
    }
}