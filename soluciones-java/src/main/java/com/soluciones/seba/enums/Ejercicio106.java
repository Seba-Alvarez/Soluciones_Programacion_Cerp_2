package com.soluciones.seba.enums;

public class Ejercicio106 {
    public static void main(String[] args) {
        TiposAlimentos menu = TiposAlimentos.CARNE;
        System.out.println( "el menu de hoy es: " + menu.getComida());
    }

    public enum TiposAlimentos {
        POLLO ("Milanesas de pollo"),
        CARNE ("Milanesas de carne"),
        CERDO ("Milanesas de cerdo"),
        SOJA ("Milanesas de soja"),
        JAMON ("Milanesas de jamon");

        private final String comida;

        private TiposAlimentos (String comida){
            this.comida = comida;
        }

        public String getComida(){
            return comida;
        }
    }
}
