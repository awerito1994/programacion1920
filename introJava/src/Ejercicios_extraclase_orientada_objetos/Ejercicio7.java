/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_extraclase_orientada_objetos;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        int num[] = new int[15];
        int numero = 0;
        int sitio = 0;
        int ind = 0;
         Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();

        for (int indice = 0; indice < num.length - 1; indice++) {
            System.out.print("ingrese por vaor sus numeros: ");
            num[indice] = teclado.nextInt();

        }

        System.out.println("Usted debe seleccionar 1 para asi pueda introducir un nuevo numero");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            System.out.print("ingrese un nuevo numero: ");
            numero = teclado.nextInt();

        } else {
            if (opcion != 0) {

            }

        }
        while (num[ind] < numero && ind < 5) {
            sitio++;
            ind++;

        }
        System.out.println("El anterior cajón queda: ");
        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);

        }

        for (int k = 13; k >= sitio; k--) {
            num[k + 1] = num[k];

        }
        num[sitio] = numero;
        System.out.println("El nuevo cajón queda :");
        for (int i = 0; i < 15; i++) {
            System.out.println(num[i]);

        }

    }
        
    }
    

