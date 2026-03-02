package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Ingresar el número a buscar");
            int num = sc.nextInt();
            System.out.println("los divisores positivos de " + num + " son: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0){
                    System.out.print(i + ", ");
                }
            }
        }
    }
}