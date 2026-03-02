package com.soluciones.seba.variables;

public class Ejercicio7 {
    public static void main(String[] args) {
        int var1 = 2024;

        if (var1 % 4 == 0 && var1 % 100 != 0){
            System.out.println("el año es bisiesto");
        }
        else {
            System.out.println("el año no es bisiesto");
        }
    }    
}
