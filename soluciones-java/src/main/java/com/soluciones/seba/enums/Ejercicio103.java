package com.soluciones.seba.enums;

public class Ejercicio103 {
    public static void main(String[] args) {
        System.out.println("productos disponibles");
        for (CategoriasProducto cat : CategoriasProducto.values()) {
            if (cat.getCP().equals("Disponible")){
                System.out.println(cat.name());
                }
        }        
    }

    enum CategoriasProducto {
        ELECTRODOMESTICOS ("Disponible"),
        MUEBLES ("Disponible"),
        MOTOS ("Disponible"),
        AUTOS ("Disponible"),
        COMIDA ("Disponible"),
        ALCOHOL ("No Disponible"),
        MEDICAMENTOS ("No Disponible");

        private final String catp;

        private CategoriasProducto (String catp){
            this.catp = catp;
        }

        public String getCP(){
            return catp;
        }
    }
}
