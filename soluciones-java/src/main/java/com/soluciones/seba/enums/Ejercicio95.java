package com.soluciones.seba.enums;

import java.util.Scanner;

public class Ejercicio95 {
    enum MesesDelAnio {
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println(MesesDelAnio.ENERO);
                    break;
                case 2:
                    System.out.println(MesesDelAnio.FEBRERO);
                    break;
                case 3:
                    System.out.println(MesesDelAnio.MARZO);
                    break;
                case 4:
                    System.out.println(MesesDelAnio.ABRIL);
                    break;
                case 5:
                    System.out.println(MesesDelAnio.MAYO);
                    break;
                case 6:
                    System.out.println(MesesDelAnio.JUNIO);
                    break;
                case 7:
                    System.out.println(MesesDelAnio.JULIO);
                    break;
                case 8:
                    System.out.println(MesesDelAnio.AGOSTO);
                    break;
                case 9:
                    System.out.println(MesesDelAnio.SEPTIEMBRE);
                    break;
                case 10:
                    System.out.println(MesesDelAnio.OCTUBRE);
                    break;
                case 11:
                    System.out.println(MesesDelAnio.NOVIEMBRE);
                    break;
                case 12:
                    System.out.println(MesesDelAnio.DICIEMBRE);
                    break;
                default:
                    System.out.println("inválido");
}
        }
    }
}
