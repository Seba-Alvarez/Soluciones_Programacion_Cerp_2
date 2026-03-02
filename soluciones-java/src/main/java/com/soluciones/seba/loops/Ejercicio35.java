package com.soluciones.seba.loops;

public class Ejercicio35 {
    public static void main(String[] args) {
        int[] m1 = new int[5];
        m1[0] = 1;
        m1[1] = 1;
        m1[2] = 1;
        m1[3] = 1;
        m1[4] = 1;

        int sum = 0;
        
        for (int i = 0; i < m1.length; i++) {
            sum += m1[i];
        }

        System.out.println(sum);
    }
}