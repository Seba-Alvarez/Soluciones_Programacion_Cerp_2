package com.soluciones.seba.enums;

public class Ejercicio98 {
    public static void main(String[] args) {
        System.out.println(convertir(Monedas.EUR));
    }

    public static double convertir (Monedas moneda){
        return moneda.getValor();
    }

    public enum Monedas {
        CNY(0.14),
        EUR(1.09),
        GBP(1.27),
        AUD(0.66),
        JPY(0.007);

        private final double valor_d;

        private Monedas(double valor_d) {
            this.valor_d = valor_d;
        }

        public double getValor(){
            return valor_d;
        } 
    }
}
