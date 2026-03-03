package com.soluciones.seba.enums;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio97 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)){
            ArrayList<TallasRopa> ropa = new ArrayList<>();
            ropa.add(TallasRopa.L);
            ropa.add(TallasRopa.M);
            ropa.add(TallasRopa.L);
            ropa.add(TallasRopa.S);

            System.out.println("ingresar talla (S,M,L o X)");
            String buscar = sc.nextLine().toUpperCase();

            try {
                TallasRopa t_bus = TallasRopa.valueOf(buscar);
                if (ropa.contains(t_bus)){
                    System.out.println("en stock");
                }   
                else{
                    System.out.println("no hay stock");
                }
            } 
            
            catch (IllegalArgumentException e) {
                System.out.println("input invalido");
            }
       }
    }

    public enum TallasRopa {
        S,
        M,
        L,
        X,
    }
}
