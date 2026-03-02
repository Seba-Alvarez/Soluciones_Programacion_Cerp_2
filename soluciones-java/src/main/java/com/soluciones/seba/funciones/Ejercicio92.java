package com.soluciones.seba.funciones;

public class Ejercicio92 {
    public static void main (String[] args){
        String ip = "100.100.100.100.1";
        String[] arr = ip.split("\\.");

        if (arr.length != 4){
            System.out.println("invalida");
            return;
       }

        for (String str : arr) {
            try {
                int num = Integer.parseInt(str);
                if (num < 0 || num > 255){
                    System.out.println("invalida");
                    return;
                }
            } 
            catch (NumberFormatException e) {
                System.out.println("invalida");
                return;
            }
       }

       System.out.println("valida");
    }
}