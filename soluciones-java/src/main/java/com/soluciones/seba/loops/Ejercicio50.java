package com.soluciones.seba.loops;

import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ingresar primer número");
            int num1 = sc.nextInt();
            System.out.println("ingresar segundo número");
            int num2 = sc.nextInt();

            if (num2 == 0){
                System.out.println("no se puede dividir por 0");
            }
            else {
                double resu = (double) num1 / num2;
                int rest = num1 %  num2;
                int coci = num1 / num2;
                System.out.println("el resultado es " + resu + " el cociente es " + coci + " el resto es " + rest);
            }
        }
    }    
}
