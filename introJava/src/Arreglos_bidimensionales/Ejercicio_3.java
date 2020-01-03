/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_bidimensionales;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int indice;
        int x;

        System.out.println("DATOS A MATRIZ A :");
        System.out.println("====================================================");

        for (indice = 0; indice <= 2; indice++) {
            for (x = 0; x <= 2; x++) {
                System.out.print("Escribir un valor para MATRIZ A: ");
                a[indice][x] = entrada.nextInt();
            }
        }

        System.out.println("====================================================");
        System.out.println("DATOS A MATRIZ B: ");

        for (indice = 0; indice <= 2; indice++) {
            for (x = 0; x <= 2; x++) {
                System.out.print("Escribir un valor para MATRIZ B: ");
                b[indice][x] = entrada.nextInt();
            }
        }

        for (indice = 0; indice <= 2; indice++) {
            for (x = 0; x <= 2; x++) {
                c[indice][x] = a[indice][x] * b[indice][x];
            }
        }

        System.out.println("El resultado de la multiplicación de dos matrices son: ");
        for (indice = 0; indice <= 2; indice++) {
            for (x = 0; x <= 2; x++) {
                System.out.print(c[indice][x] + " ");

            }

            System.out.println("");
        }
        
    }
}
