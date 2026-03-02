package com.soluciones.seba.variables;

import java.util.Scanner;

public class Ejercicio20 {
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresar primer número");
        double var1 = scanner.nextDouble();

        System.out.println("ingresar el operador");
        String ope = scanner.next();

        System.out.println("ingresar segundo número");
        double var2 = scanner.nextDouble();

        double res = 0;

        switch (ope){
            case "+":
                res = var1 + var2;
                break;
            case "-":
                res = var1 - var2;
                break;
            case "*":
                res = var1 * var2;
                break;
            case  "/":
                if (var1 == 0 || var2 == 0){
                    System.out.println("no se puede dividir por 0");
                }
                else{
                    res = var1 / var2;
                }
                break;
        }
        System.out.println("resultado " + res);

        scanner.close();

    }    
}
