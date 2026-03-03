package com.soluciones.seba.enums;

public class Ejercicio100 {
    public static void main(String[] args) {
        DiasHabiles dia = DiasHabiles.DOMINGO;
        System.out.println(dia.getDh());        
    }
    
    enum DiasHabiles {
        LUNES ("Laborable"),
        MARTES ("Laborable"),
        MIERCOLES ("Laborable"),
        JUEVES ("Laborable"),
        VIERNES ("Laborable"),
        SABADO ("No Laborable"),
        DOMINGO ("No Laborable");

        private final String dh;

        private DiasHabiles (String dh){
            this.dh = dh;
        }

        public String getDh(){
            return dh;
        }
    }
}
