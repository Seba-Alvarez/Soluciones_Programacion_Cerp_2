package com.soluciones.seba.busqueda;

import java.util.ArrayList;

public class Ejercicio108 {
    public static void main(String[] args) {
        int[] num_lis = {2,3,1,4,6,5,7};
        ArrayList<Integer> lis_or = new ArrayList<>();
        
        for (int num : num_lis) {
            int pos = 0;
            while (pos < lis_or.size() && lis_or.get(pos) < num){
                pos++;
            }
            lis_or.add(pos, num);
        }
        
        System.out.println(lis_or);
    }   
}
