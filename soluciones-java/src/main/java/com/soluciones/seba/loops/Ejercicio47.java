package com.soluciones.seba.loops;

public class Ejercicio47 {
    public static void main(String[] args) {
        for (int x = 1; x < 1000; x++) {
            for (int y = x + 1 ; y < 1000; y++) {
                int z = 1000 - x - y;

                if (z > y && x * x + y * y == z * z){
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                    System.out.println("z = " + z);
                    System.out.println("xyz = " + (x * y * z));
                    return;
                }
            }            
        }
    }
}
