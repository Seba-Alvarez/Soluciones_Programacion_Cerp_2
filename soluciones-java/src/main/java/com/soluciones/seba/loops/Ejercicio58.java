package com.soluciones.seba.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            List <Integer> nums = new ArrayList<>();
            boolean con = true;
            System.out.println("ingresar valor máximo de los números");
            int max = sc.nextInt();
            System.out.println("ingresar hasta 10 números enteros (si ingresa -1 saldrá finalizará el ingreso de números)");
            while (con) { 
                int num = sc.nextInt();
                if (num >= max){
                    System.out.println("Fuera de rango");
                }
                else if (nums.size() >= 10){
                    con = false;
                }
                else if (num == -1){
                    System.out.println("finalizando inserción de números");
                    con = false;
                }
                else {
                    nums.add(num);
                }
            }

            System.out.println("histograma");
            for (int nom = 0; nom <= max; nom++){
                int cont = 0;
                for (int i : nums){
                    if (i == nom){
                        cont ++;
                    }
                }
                if (cont > 0){
                    System.out.println(nom + ": " + "*".repeat(cont));
                }
            }
        }
    }
}