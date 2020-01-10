/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_9_1_2020;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Deber_num_2 {

    public static void main(String[] args) {

        System.out.println("Que opcion desea realizar: ");
        System.out.println("===============================================");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("================================================");
        Scanner teclado = new java.util.Scanner(System.in);
        int op = teclado.nextInt();
        System.out.println("Escoja los numeros del 1 al 10: ");
        System.out.println("===============================================");
        int numero = teclado.nextInt();
        System.out.println("================================================");
        switch (op) {
            case 1:
                System.out.println(suma(numero));
                break;
            case 2:
                System.out.println(resta(numero));
                break;
            case 3:
                System.out.println(multiplicacion(numero));
                break;
            case 4:
                System.out.println(division(numero));
                break;

        }
    }

    public static int suma(int num) {
        int suma = 0;
        for (int indice = 0; indice <= 10; indice++) {
            suma = num + indice;
            System.out.println(+num + " + " + indice + " = " + suma);
        }
        return suma;
    }

    public static int resta(int num) {
        int resta = 0;
        for (int indice = 0; indice <= 10; indice++) {
            resta = num - indice;
            System.out.println(+num + " - " + indice + " = " + resta);
        }
        return resta;
    }

    public static int multiplicacion(int num) {
        int multiplicacion = 0;
        for (int indice = 0; indice <= 10; indice++) {
            multiplicacion = num * indice;
            System.out.println(+num + " * " + indice + " = " + multiplicacion);
        }
        return multiplicacion;
    }

    public static double division(float num) {
        float division = 0;
        for (float indice = 1; indice <= 10; indice++) {
            division = num / indice;
            System.out.println(+num + " / " + indice + " = " + division);
        }
        return division;
    }

}
