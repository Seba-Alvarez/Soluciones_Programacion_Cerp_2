package com.soluciones.seba.loops;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            Random rand = new Random();
            int min = 0, max = 100, cma = 0, cme = 0, cig = 0;
            double com = 0.5;
            
            System.out.println("ingresar largo de la secuencia");
            int cant = sc.nextInt();
            int[] num = new int[cant];

            
            for (int i = 0; i < num.length; i++) {
                num[i] = rand.nextInt((max - min) + 1) + min;
            }

            for (int i = 0; i < num.length; i++){
                if (num[i] > com){
                    cma++;
                }
                else if (num[i] < com) {
                    cme++;
                }
                else {
                    cig++;
                }
            }
            System.out.println("La cantidad de números mayores es " + cma + " la cantidad de números menores es " + cme + " y la cantidad de iguales es " + cig);
        }
    }
}
