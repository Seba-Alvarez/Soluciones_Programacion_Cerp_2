package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ingresar el primer núemero");
            int var1 = sc.nextInt();
            System.out.println("ingresar el segundo número");
            int var2 = sc.nextInt();

            while(var2 != 0){
                int temp = var2;
                var2 = var1 % var2;
                var1 = temp;
            }

            System.out.println("el mcd es: " + var1);
        }
    }
}
