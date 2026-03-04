package com.soluciones.seba.busqueda;

import java.util.Scanner;

public class Ejercicio110 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            int n = sc.nextInt();
            int pri = 0, sec = 1;
            
            switch (n) {
                case 1:
                    System.out.println("la secuencia es " + pri);
                    break;
                case 2:
                    System.out.println("la secuencia es " + pri + " " + sec);
                    break;
                default:
                    for (int i = 0; i < n; i++){
                        System.out.print(pri + "");
                        int sig = pri + sec;
                        pri = sec;
                        sec = sig;
                    }   break;
            }
        }
    }    
}
