package com.soluciones.seba.funciones;

public class Ejercicio83 {
    public static void main(String[]args){
        double vol = 30.1;
        System.out.println("el volumen es " + vol_es(vol));
    }

    public static double vol_es(double rad){
        double vol = (4.0/3) * Math.PI * Math.pow(rad, 3);
        return vol;
    }
}