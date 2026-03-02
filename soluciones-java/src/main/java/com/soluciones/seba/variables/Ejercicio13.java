package com.soluciones.seba.variables;

public class Ejercicio13 {
    public static void main(String[] args) {
        int var1 = 48, var2 = 18;
        int o_var1 = var1;
        int o_var2 = var2;

        while(var2 != 0){
            int temp = var2;
            var2 = var1 % var2;
            var1 = temp;
        }

        int mcd = var1;
        int mcm = o_var1 * o_var2 / mcd;

        System.out.println("el mcm es: " + mcm);

    }    
}
