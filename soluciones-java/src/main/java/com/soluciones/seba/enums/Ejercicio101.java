package com.soluciones.seba.enums;

public class Ejercicio101 {
    public static void main(String[] args){
        EstadosPedido nex = EstadosPedido.RECIBIDO;
        EstadosPedido sig = nex.siguiente();
        System.out.println(sig);
    }

    public enum EstadosPedido {
        PENDIENTE,
        RESERVADO,
        ENVIADO,
        RECIBIDO;
    
        public EstadosPedido siguiente(){
            switch(this) {
                case PENDIENTE:
                    return RESERVADO;
                case RESERVADO:
                    return ENVIADO;
                case ENVIADO:
                    return RECIBIDO;
                case RECIBIDO:
                    return PENDIENTE;
                default:
                    return this;
            }
        }
    
    }
}
