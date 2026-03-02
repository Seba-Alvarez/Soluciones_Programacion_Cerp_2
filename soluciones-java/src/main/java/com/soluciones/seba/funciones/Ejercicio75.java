package com.soluciones.seba.funciones;

public class Ejercicio75 {
    public static void main(String[] args) {
        int base = 10, exp = 10;
        System.out.println("la potencia es " + pot(base, exp));
    }

    public static int pot (int base, int exp){
        int res = 1;
        for (int i = 0; i < exp; i++) {
            res *= base;
        }
        return res;
    }
}