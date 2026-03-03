package com.soluciones.seba.enums;

public class Ejercicio107 {
    public static void main(String[] args) {
        TiposAnimales animal = TiposAnimales.TRICERATOPS;
        System.out.println(animal.getDesc());
    }

    enum TiposAnimales {
        GATO ("Los peores de todos"),
        PERRO ("Mucho mejor que los gatos"),
        TRICERATOPS ("Nunca vi uno");

        private TiposAnimales (String desc){
            this.desc = desc;
        }
        
        public String getDesc(){
            return desc;
        }

        private final String desc;
    }
}
