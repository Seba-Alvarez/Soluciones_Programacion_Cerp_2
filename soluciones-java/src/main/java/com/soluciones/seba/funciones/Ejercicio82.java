package com.soluciones.seba.funciones;

public class Ejercicio82 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("la suma es: " + pri_num(num));
        
    }
    public static int pri_num (int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
}