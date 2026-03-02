package com.soluciones.seba.loops;


import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingresar número");
            int var1 = sc.nextInt();
            boolean prime = true;

            if (var1 < 2){
                prime = false;
            }

            for (int i = 2; i < var1; i++) {
                if (var1 % i == 0){
                    prime = false;
                }
            }
            if (prime == true){
                System.out.println(var1 + " es primo");
            }
            else {
                System.out.println(var1 + " no es primo");
            }
        }
    }
}

