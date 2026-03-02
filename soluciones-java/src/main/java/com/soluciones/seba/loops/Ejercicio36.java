package com.soluciones.seba.loops;

public class Ejercicio36 {
    public static void main(String[] args) {
        int[] m1 = new int[5];
        m1[0] = 2;
        m1[1] = 2;
        m1[2] = 2;
        m1[3] = 2;
        m1[4] = 2;

        int sum = 0; 
        int avg;
        
        for (int i = 0; i < m1.length; i++) {
            sum += m1[i];
        }
        
        avg = sum / m1.length;

        System.out.println(avg);
    }
}