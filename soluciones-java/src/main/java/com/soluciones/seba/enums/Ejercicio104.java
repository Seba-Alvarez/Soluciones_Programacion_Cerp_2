package com.soluciones.seba.enums;

import java.util.Scanner;

public class Ejercicio104 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ingresar estado de cuenta");
            String valor = sc.nextLine().toUpperCase();
            EstadosCuenta estado = EstadosCuenta.valueOf(valor);

            switch (estado){
                case SUSPENDIDA:
                case BLOQUEADA: 
                case CERRADA:
                    System.out.println("error en la cuenta");
                    break;
                case ACTIVA:
                    System.out.println("todo en orden");
            }
        }
    }

    public enum EstadosCuenta{
        ACTIVA,
        SUSPENDIDA,
        BLOQUEADA,
        CERRADA;
    }
}
