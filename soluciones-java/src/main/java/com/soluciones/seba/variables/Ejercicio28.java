package com.soluciones.seba.variables;

public class Ejercicio28 {
        public static void main(String[] args) {
        int var1 = 23;
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
            System.out.println("el número es primo");
        }
        else {
            System.out.println("el número no es primo");
        }
    }   
}
