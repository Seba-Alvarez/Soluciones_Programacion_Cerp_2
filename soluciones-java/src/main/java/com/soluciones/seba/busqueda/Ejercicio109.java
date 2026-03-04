package com.soluciones.seba.busqueda;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio109 {
    public static void main(String[] args) {
        char[] tex = {'a','a','b','c'};
        Map<Character, Integer> res = cont_char(tex);
        for (Map.Entry<Character, Integer> en : res.entrySet()) {
            System.out.println("" + en.getKey() + " = " +  en.getValue());            
        }
    }

    public static Map<Character, Integer> cont_char (char[] cad){
        Map<Character, Integer> cont = new HashMap<>();
        for (char c : cad){
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
