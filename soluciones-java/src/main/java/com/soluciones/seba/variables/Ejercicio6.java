package com.soluciones.seba.variables;

public class Ejercicio6 {
    public static void main(String[] args) {
        int var1 = 11, var2 = 5;
        System.out.println("valores originales: " + var1 + " y " + var2);
        
        int temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("una vez intercambiados son: " + var1 + " y " + var2);
    }   
}
