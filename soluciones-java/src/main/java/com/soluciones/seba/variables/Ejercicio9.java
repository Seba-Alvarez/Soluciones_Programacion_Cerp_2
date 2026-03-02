package com.soluciones.seba.variables;

public class Ejercicio9 {
    public static void main(String[] args) {
       int var1 = 5, var2 = 1;
       
       for (int i = 1; i <= var1; i++){
            var2 = var2 * i;
       }

       System.out.println("el factorial de: " + var1 + " es: " + var2);
       
    }    
}
