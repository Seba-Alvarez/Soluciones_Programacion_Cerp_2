package com.soluciones.seba.variables;

public class Ejercicio16 {
    public static void main(String[] args) {
        int var1 = 18;
        double var2 = 0.00;

        if (var1 <= 0){
            System.out.println("el número debe ser mayor a 0");
        }

        for (int i = 1; i <= var1; i++) {
            var2 += (1.0/i); 
        }

        if (var2 == (int)var2){
            System.out.println("el número " + var2 + " es harmónico");
        }
        else {
            System.out.println("el número " + var2 + " NO es harmónico");    
        }
    }    
}
