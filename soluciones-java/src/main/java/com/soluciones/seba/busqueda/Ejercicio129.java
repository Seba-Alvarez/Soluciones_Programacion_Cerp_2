package com.soluciones.seba.busqueda;

public class Ejercicio129 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 8, 2, 3, 5, 5, 5};

        int masf = arr[0];
        int maxf = 0;

        for (int i = 0; i < arr.length; i++) {
            int cont = 0;
            for (int ii = 0; ii < arr.length; ii++) {
                if (arr[i] == arr[ii]){
                    cont++;
                }                
            }
            if (cont > maxf){
                maxf = cont;
                masf = arr[i];
            }            
        }
       System.out.println("número mas frecuente es " + masf);
        
    }  
}