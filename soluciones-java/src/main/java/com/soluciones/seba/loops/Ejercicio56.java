package com.soluciones.seba.loops;

public class Ejercicio56 {
    public static void main(String[] args) {
        int row = 4, num = 1;

        for (int i = 1; i <= row; i++) {
            for (int ii = 1; ii <= i; ii++) {
                System.out.print(num + " ");
                num ++;
            }
            System.out.println("");
        }
    }
}
