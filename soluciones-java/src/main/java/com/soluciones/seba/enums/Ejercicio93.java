package com.soluciones.seba.enums;

public class Ejercicio93 {
        
        enum DiasSemana {
            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES,
            SABADO,
            DOMINGO
        }

        public static void main(String[] args) {
            DiasSemana hoy = DiasSemana.LUNES;
            System.out.println("hoy es " + hoy);
        }
}

