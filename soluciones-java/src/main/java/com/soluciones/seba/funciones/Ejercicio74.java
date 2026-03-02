package com.soluciones.seba.funciones;

public class Ejercicio74 {
    public static void main(String[] args) {
        int num1 = 2027;
        System.out.println("el número proporcionado es pimo? " + es_primo(num1));
    }

    public static boolean es_primo (int num1){
        boolean is_prime = true;
        if (num1 < 2){
                is_prime = false;
            }

            for (int i = 2; i < num1; i++) {
                if (num1 % i == 0){
                    is_prime = false;
                    break;
                }
            }
            return is_prime;
    }
}
