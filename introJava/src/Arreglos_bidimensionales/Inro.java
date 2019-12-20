/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_bidimensionales;

/**
 *
 * @author POWER COMPUTERS
 */
public class Inro {
    public static void main(String[] args) {
         //Declaración de matriz con valores conocidos (dimensiones) 2x5
        String nombres[][]
                = {{"Alexander", "Isaias", "Dodi", "Mario", "Luis"},
                {"Genesis", "Diego", "Ramiro", "Anthony", "Ariel"}};

        //System.out.println(nombres [0][2]);
        //System.out.println(nombres [1][4]);
        System.out.println("filas;" + nombres.length);// Devuelve el número de filas

        for (int fila = 0; fila < 5; fila++) {//Recorremos las filas
            //int tam_cols = +nombres[fila].length;// Obtenemos el f de columnas de la fila
            for (int col = 0; col <2; col++) { //recorremos columnas
                System.out.print(nombres[col][fila] + "\t");
            }
            System.out.println("");

        }
    }

    }
    

