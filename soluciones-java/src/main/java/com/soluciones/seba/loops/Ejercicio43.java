package com.soluciones.seba.loops;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            System.out.println("ingresar la cantidad de numeros a sumar");
            int cant = sc.nextInt();
            int suma = 0;
            ArrayList<Integer> nump = new ArrayList<>();
            
            System.out.println("Ingresar los numeros a sumar");
            for (int i = 0; i < cant; i++) {
                int num = sc.nextInt();
                if (num % 2 == 0){
                    nump.add(num);
                }
            }

            for (int i = 0; i < nump.size(); i++) {
                suma += nump.get(i); 
            }

            System.out.println("la suma de los números ingresados es: " + suma);

        }
    }
}