package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("ingresar el precio");
            double pre = sc.nextDouble();
           
            System.out.println("ingresar descuento");
            double des = sc.nextDouble();

            double pre_f = pre - (pre * des / 100);
            System.out.printf("el precio final con el descuento es: %.2f%n", pre_f);
        }
    }
}
