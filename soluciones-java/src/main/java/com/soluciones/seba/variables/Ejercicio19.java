package com.soluciones.seba.variables;

public class Ejercicio19 {
    public static void main(String[] args) {
        int var1 = 101;
        String var1str = Integer.toString(var1);
        int lon = var1str.length(); 
        boolean cap = true;

        for (int i = 0; i < (lon / 2); i++) {
            if (var1str.charAt(i) != var1str.charAt(lon - 1 - i)){
                cap = false;
                break;
            }
        }

        if (cap == true){
            System.out.println("el número es capicúa");
        }
        else{
            System.out.println("no es capicúa");
        }
        
    }    
}
