package com.soluciones.seba.variables;

public class Ejercicio10 {
    public static void main(String[] args) {
        String var1 = "h";
        
        if("aeiou".contains(var1)){
            System.out.println( var1 + " es una vocal");
        }
        else if("bcdfghjklmnñpqrstvwxyz".contains(var1)){
            System.out.println(var1 + " es una consonante");
        }
        else{
            System.out.println(var1 + " no es una letra");   
        }
        
    }    
}
