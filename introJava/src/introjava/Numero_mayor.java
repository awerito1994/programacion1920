/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author Salas
 */
public class Numero_mayor {

    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA IDENTIFICAR EL MAYOR DE 3 NÚMEROS");

        int numero1 = 20;
        int numero2 = 20;
        int numero3 = 10;
        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("numero1 es el mayor");

        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("numero2 es el mayor");

        } else if (numero3 >= numero1 && numero3 >= numero2) {
            System.out.println("numero3 es el mayor");

        } else {//este camino es opcional

        }//fin del bloque if

    }

}