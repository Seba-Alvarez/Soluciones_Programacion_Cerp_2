package com.soluciones.seba.busqueda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio114 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("ingresar tamaño del array");
            int lar = sc.nextInt();
            sc.nextLine();

            char[] arr = new char[lar];

            System.out.println("ingresar " + lar + " caracteres");
            for (int i = 0; i < lar; i++) {
                arr[i] = sc.nextLine().charAt(0);
            }
            
            Map<Character, Integer> res = cont_char(arr);
                for (Map.Entry<Character, Integer> en : res.entrySet()) {
                    System.out.println("" + en.getKey() + " = " +  en.getValue());            
            }
        }
    }

    public static Map<Character, Integer> cont_char (char[] cad){
        Map<Character, Integer> cont = new HashMap<>();
        Map<Character, Integer> repe = new HashMap<>();
        for (char c : cad){
            if (cont.containsKey(c)){
                cont.put(c, cont.get(c) + 1);
                repe.put(c, cont.get(c));
            }
            else {
                cont.put(c, 1);
            }
        }
        return repe;
    }
}