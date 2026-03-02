package com.soluciones.seba.variables;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingresar numero");
            int var1 = sc.nextInt();
            List<Integer> tab = new ArrayList<>();

            for (int i = 0; i <= 10; i++) {
                tab.add(var1 * i);
            }
        
            System.out.println("la tabla del " + var1 + " es " + tab);

        }
    }    
}
