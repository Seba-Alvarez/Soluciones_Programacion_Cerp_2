package com.soluciones.seba.loops;

public class Ejercicio33 {
    public static void main(String[] args) {
        int[][] m1 = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        boolean sim = true;
        int var1 = m1.length;

        for (int i = 0; i < var1 && sim; i++) {
            for (int ii = i + 1; ii < var1; ii++) {
                if (m1[i][ii] != m1[ii][i]){
                    sim = false;
                    break;
                }
            }
        }
        
        System.out.println("simétrica? - " + sim);

    }
}
