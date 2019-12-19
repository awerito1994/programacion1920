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
public class Ejercicio2 {

    public static void main(String[] args) {
        int venta_may = 0;
        int venta_men = 0;
        int dia[] = new int[30];
        Scanner teclado = new Scanner(System.in);
        for (int indice = 0; indice < dia.length; indice++) {
            System.out.print("Ingrese el valor de ventas de hoy: :" );
            dia[indice] = teclado.nextInt();
            if (dia[indice] > venta_may) {
                venta_may = dia[indice];
            }
            if (dia[indice] < venta_men) {
                venta_men = dia[indice];

            }
        }
        System.out.println("La mayor venta de hoy es: " + venta_may +"$");
        System.out.println("La menor venta de hoy es: " + venta_men+"$");
    }
}
