package com.soluciones.seba.funciones;

public class Ejercicio77 {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(num + " en binario es " + to_binary(num));        
    }

    public static String to_binary (int num){
        String bin = Integer.toBinaryString(num);
        return bin;
    }
}
