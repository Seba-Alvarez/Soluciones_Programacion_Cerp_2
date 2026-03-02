package com.soluciones.seba.funciones;

public class Ejercicio90 {
    public static void main(String[] args) {
        double t1 = 33.3, t2 = 42.1, t3 = 30.1;
        double ct1 = f_to_c(t1);
        double ct2 = f_to_c(t2);
        double ct3 = f_to_c(t3);

        double t = (ct1 + ct2 + ct3)/3;
        System.out.println("la media es: " + t);
    }

    public static double c_to_f (double num){
        return (num * 1.8) + 32;
    }

    public static double f_to_c (double num){
        return (num - 32) / 1.8;
    }
}
