package com.soluciones.seba.loops;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio34 {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1, max = 100;
        int[] num = new int[5];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt((max - min) + 1) + min;
        }

        System.out.println(Arrays.toString(num));
    }
}
