package com.soluciones.seba.funciones;

public class Ejercicio84 {
    public static void main(String[] args) {
        int[][] m1 = {
            {1, 4, 74},
            {2, 4, 55},
            {11, 2, 7}};
        
        int[][] m2 = trasp(m1);

        for (int[] m21 : m2) {
            for (int ii = 0; ii < m21.length; ii++) {
                System.out.print(m21[ii] + " ");                
            }
            System.out.println();
        }
    }

    public static int[][] trasp (int[][] m1){
        int[][] m2 = new int[m1.length][m1.length];
        int len = m1.length;
        for (int i = 0; i < len; i++) {
            for (int ii = 0; ii < len; ii++) {
                m2[ii][i] = m1[i][ii];
            }
        }
        return m2;
    }
}
