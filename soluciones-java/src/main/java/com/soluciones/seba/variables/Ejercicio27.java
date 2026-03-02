package com.soluciones.seba.variables;

public class Ejercicio27 {
    public static void main(String[] args) {
        int var1 = 6, var2 = 7, var3 = 8;

        double sp = (var1 + var2 + var3) / 2.0;
        double ar = Math.sqrt(sp * (sp - var1) * (sp - var2) * (sp - var3));

        System.out.println("El área es " + ar);
    }    
}
