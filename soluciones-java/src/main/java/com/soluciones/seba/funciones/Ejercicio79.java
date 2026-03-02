package com.soluciones.seba.funciones;

public class Ejercicio79 {
    public static void main(String[] args) {
        int num1 = 48, num2 = 18;
        System.out.println("el mcm es " + mcm(num1, num2));
    }

    public static int mcm (int num1, int num2){
        int o_var1 = num1;
        int o_var2 = num2;

        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int mcd = num1;
        int mcm = o_var1 * o_var2 / mcd;

        return mcm;
    }
}
