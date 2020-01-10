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
public class Deber_num_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int numero = teclado.nextInt();
        System.out.println("");
        System.out.println("ESCOJA UNA OPCIÓN");
        System.out.println("===========================================");
        System.out.println("1. Tangente");
        System.out.println("2. Cotangente");
        System.out.println("3. Secante");
        System.out.println("4. Cosecante");
        System.out.println("============================================");

        int op = teclado.nextInt();

        switch (op) {
            case 1:
                System.out.println(Tangente(numero));
                break;
            case 2:
                System.out.println(Cotangente(numero));
                break;
            case 3:
                System.out.println(Secante(numero));
                break;
            case 4:
                System.out.println(Cosecante(numero));
                break;
            default:
                System.out.println("La opción seleccionada no es válida");
        }
    }

    public static double Tangente(double numero) {
        double tang = 0;
        tang = Math.sin(numero) / Math.cos(numero);
        return tang;
    }

    public static double Cotangente(double numero) {
        double cotan = 0;
        cotan = Math.cos(numero) / Math.sin(numero);
        return cotan;
    }

    public static double Secante(double numero) {
        double secan = 0;
        secan = 1 / Math.cos(numero);
        return secan;
    }

    public static double Cosecante(double numero) {
        double cosecan = 0;
        cosecan = 1 / Math.sin(numero);
        return cosecan;
    }
}
