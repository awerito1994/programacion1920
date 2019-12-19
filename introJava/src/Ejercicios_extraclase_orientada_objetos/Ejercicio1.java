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
public class Ejercicio1 {

    public static void main(String[] args) {
        String nombre[] = new String[20];
        int posicion;
        Scanner teclado = new Scanner(System.in);
        for (int indice = 0; indice < nombre.length; indice++) {
            System.out.println("Ingrese el nombre de una persona: " + indice);
            nombre[indice] = teclado.next();
        }
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese en que posicion se encuentra el nombre: ");
            String error = "Lo que usted ha ingresado es incorrecto, ingrese una posición corrrecta: ";
            posicion = teclado.nextInt();
            if (posicion <=20) {
                System.out.println("El nombre que escogio es: " + nombre[posicion]);
            } else {
                System.out.println("" + error);
            }

        }
    }

}
