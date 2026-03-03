package com.soluciones.seba.enums;

public class Ejercicio99 {
    public static void main(String[] args){
        TiposVehiculo auto = TiposVehiculo.FERRARI;
        System.out.println(auto.getPrice());        
    }

    public enum TiposVehiculo {
        TOYOTA (1111),
        MITSUBISHI (2222),
        FERRARI (33333),
        CADILLAC (44444);

        private final int price;

        private TiposVehiculo (int price){
            this.price = price;
        }

        public int getPrice(){
            return price;
        }
    }
}
