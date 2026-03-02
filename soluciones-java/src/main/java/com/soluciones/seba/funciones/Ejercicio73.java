package com.soluciones.seba.funciones;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio73 {
    public static void main(String[] args) {
        String tex = "texto";
        Map<Character, Integer> res = cont_char(tex);
        for (Map.Entry<Character, Integer> en : res.entrySet()) {
            System.out.println("" + en.getKey() + " = " +  en.getValue());            
        }
    }

    public static Map<Character, Integer> cont_char (String cad){
        Map<Character, Integer> cont = new HashMap<>();
        for (char c : cad.toCharArray()){
            if (cont.containsKey(c)){
                cont.put(c, cont.get(c) + 1);
            }
            else {
                cont.put(c, 1);
            }
        }
        return cont;
    }
}