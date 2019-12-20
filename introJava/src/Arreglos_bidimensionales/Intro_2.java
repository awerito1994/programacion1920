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
public class Intro_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CREAR Y ESCRIBIR EN UNA MATRIZ");
        System.out.println("Ingres el número de filas de la matriz: ");
        int filas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el número de columnas de la matriz: ");
        int cols = teclado.nextInt();
        teclado.nextLine();
        System.out.println("=================================================================================");
        //Creación de una matriz vacía
        String nombres[][] = new String[filas][cols];// dimensión 2x5
        //Vamos a colocar elementos dentro de nuestra matriz
        System.out.println("Escritura de los elementos de la matriz");
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_cols = nombres[fila].length;
            for (int col = 0; col < tam_cols; col++) {//Reccrre columnas
                System.out.println("Ingrese un valor: ");
                String valor = teclado.nextLine();
                nombres [fila][col]= valor ;
            }
        }
        // Vamos a recorrer la matriz, filas y columnas.
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_cols = nombres[fila].length;
            for (int col = 0; col < tam_cols; col++) {//Reccrre columnas
                System.out.print(nombres[fila][col] + "\t");

            }
            System.out.println("");

        }
    }
}
