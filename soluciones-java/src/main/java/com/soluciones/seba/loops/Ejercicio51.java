package com.soluciones.seba.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            List<Integer> nums = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            
            System.out.println("ingresar los 5 números");
            for (int i = 0; i < 5; i++) {
                int num = sc.nextInt();
                nums.add(num);
                if (num <= min){
                    min = num;
                }

            }
            
            int min_in = nums.indexOf(min); 
            System.out.println("el menor número es: " + min + " y fue ingresado en la posición " + (min_in + 1));
        }
    }
}
