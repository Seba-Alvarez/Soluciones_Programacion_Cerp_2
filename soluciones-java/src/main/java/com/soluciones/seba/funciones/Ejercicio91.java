package com.soluciones.seba.funciones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio91 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ingresar su fecha de nacimiento (yyyy-mm-dd)");
            String nac = sc.nextLine();

            LocalDate fnac = LocalDate.parse(nac);
            LocalDate hoy = LocalDate.now();

            long res = ChronoUnit.YEARS.between(fnac, hoy); 
            System.out.println("usted tiene: " + res);

        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
