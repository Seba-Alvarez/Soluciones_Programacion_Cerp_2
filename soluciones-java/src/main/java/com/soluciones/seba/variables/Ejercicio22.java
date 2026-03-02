package com.soluciones.seba.variables;

public class Ejercicio22 {
    public static void main(String[] args) {
        int var1 = 1234;
        int prod = 1;

        while (var1 > 0) { 
            int var2 = var1 % 10;
            prod = prod * var2;
            var1 = var1 / 10;
        }
        System.out.println("el producto es " + prod);
    }    
}
