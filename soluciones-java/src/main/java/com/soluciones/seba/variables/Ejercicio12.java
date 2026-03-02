package com.soluciones.seba.variables;

public class Ejercicio12 {
    public static void main(String[] args) {
        int var1 = 48, var2 = 18;

        while(var2 != 0){
            int temp = var2;
            var2 = var1 % var2;
            var1 = temp;
        }

        System.out.println("el mcd es: " + var1);
    }    
}
