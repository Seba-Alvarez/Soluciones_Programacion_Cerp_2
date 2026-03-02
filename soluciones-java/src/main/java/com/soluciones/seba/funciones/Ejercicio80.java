package com.soluciones.seba.funciones;

public class Ejercicio80 {
    public static void main(String[] args) {
        String cad = "hola como estas";
        System.out.println(contar_pal(cad));
    }

    public static int contar_pal (String cad){
        int cont = 0;
        for (char ch : cad.toCharArray()) {
            if (ch == ' '){
                cont++;
            }
        }
        return cont;
    }
}