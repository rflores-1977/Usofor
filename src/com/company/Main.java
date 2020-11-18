package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        //tablas de multiplicar

        System.out.println("Ingrese el numero de Tabla");
        int multiplicar = rd.nextInt();
        rd.nextLine();

        for (int x=0; x<13;x++) {
            int m = multiplicar * x;
            System.out.println(multiplicar + " X " + x + " = " + m);
        }


        // Pedir nombres, Edades e imprimirlos

        int edades[] = new int[6];
        String nombres[] = new String[6];


       for(int x=0;x<6;x++) {
           System.out.println("ingrese el Nombre");
           nombres[x] = rd.nextLine();

           System.out.println("ingrese la Edad");
           edades[x] = rd.nextInt();
           rd.nextLine();
       }

        for(int x=0; x<6;x++){
            System.out.println(" El nombre es "+nombres[x]+ " y Tiene "+edades[x]+" años" );
        }
    }
}
