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
public class Ejercicio5 {

    public static void main(String[] args) {
        String nombre[] = new String[2];
        int produccion[] = new int[2];
        int estacion[] = new int[2];
        Scanner teclado = new Scanner(System.in);
        for (int cont = 0; cont < nombre.length; cont++) {
            System.out.println("Ingrede el nombre del obrero: ");
            nombre[cont] = teclado.nextLine();
            System.out.println("Ingrese la producción establecidad durante el mes: ");
            produccion[cont] = Integer.parseInt(teclado.nextLine());
            System.out.println("Ingrese el numero mas productivo:");
            estacion[cont] = Integer.parseInt(teclado.nextLine());

        }
        for (int cont = 0; cont < nombre.length; cont++) {
            System.out.println("Numero más productivo:  " + estacion[cont]);
            System.out.println("Obrero de la estación: " + nombre[cont]);
            System.out.println("La cantidad más productiva : " + produccion[cont]);
        }
    }
}
