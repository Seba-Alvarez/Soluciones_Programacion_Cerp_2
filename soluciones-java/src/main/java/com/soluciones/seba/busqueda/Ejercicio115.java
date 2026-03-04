package com.soluciones.seba.busqueda;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio115 {
    public static void main(String[] args) {
        int[] cad = {1,1,1,2,2,3,4,5,5};
        Map<Integer,Integer> num_lis = cont_ele(cad);
        for (Map.Entry<Integer, Integer> en : num_lis.entrySet()) {
                    System.out.println("" + en.getKey());            
            }
    }

    public static Map<Integer, Integer> cont_ele (int[] cad){
        Map<Integer, Integer> cont = new HashMap<>();
        Map<Integer, Integer> unic = new HashMap<>();
        for (int i : cad){
            if (cont.containsKey(i)){
                cont.put(i, cont.get(i) + 1);
                unic.remove(i);
            }
            else {
                cont.put(i, 1);
                unic.put(i, 1);
            }
        }
        return unic;
    }
}