package com.soluciones.seba.enums;

public class Ejercicio105 {
    public static void main(String[] args) {
        for (DiasFeriados fer : DiasFeriados.values()) {
            if (fer.getF().equals("Feriado")){
                System.out.println(fer.name());
            }
        }     
    }
    
    enum DiasFeriados {
        LUNES ("Feriado"),
        MARTES ("Laborable"),
        MIERCOLES ("Laborable"),
        JUEVES ("Laborable"),
        VIERNES ("Laborable"),
        SABADO ("Feriado"),
        DOMINGO ("Feriado");

        private final String esf;

        private DiasFeriados (String esf){
            this.esf = esf;
        }

        public String getF(){
            return esf;
        }
    }
}
