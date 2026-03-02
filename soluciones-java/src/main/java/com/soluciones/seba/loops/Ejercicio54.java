package com.soluciones.seba.loops;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            Random rand = new Random();
            int min = 1, max = 100;
            System.out.println("Ingresar número a ver si embocas: ");
            int numr = rand.nextInt((max - min) + 1) + min;
            boolean ad = false;

            //System.out.println(numr);
            
            while ( !ad ){
                int num = sc.nextInt();
                if (num == numr){
                    System.out.println("correcto");
                    ad = true;
                }
                else if (num > numr){
                    System.out.println("incorrecto, el número es menor");
                }
                else {
                    System.out.println("incorrecto, el número es mayor");
                }
            }
        }
    }
}
    

