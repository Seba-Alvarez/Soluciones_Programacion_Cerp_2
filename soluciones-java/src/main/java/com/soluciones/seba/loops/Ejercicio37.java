package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingresar cantidad de materias");
            int mat = sc.nextInt();
            double scal = 0;
            
            for (int i = 0; i < mat; i++) {
                System.out.println("nota materia " + (i + 1) + ": ");
                double cal = sc.nextDouble();
                scal += cal;
            }

            double avg = scal / mat;
            System.out.println("promedio " + avg); 
        }
    }
}
