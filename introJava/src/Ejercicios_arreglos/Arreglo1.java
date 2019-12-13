/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_arreglos;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Arreglo1 {

    public static void main(String[] args) {

        int edad[] = new int[2];
        Scanner entrada = new Scanner(System.in);
        String nombre[] = new String[2];
        String celular[] = new String[2];
        String universidad[] = new String[2];
        //operacion de escritura
        for (int indice = 0; indice < edad.length; indice++) {
            System.out.print("ingrese el nombre del estudiante: ");
            nombre[indice] = entrada.nextLine();
            System.out.print("Ingrese la edad del estudiante: ");
            edad[indice] = Integer.parseInt(entrada.nextLine());
            System.out.print("Ingrese la universidad del estudiante: ");
            universidad[indice] = entrada.nextLine();
            System.out.print("Ingrese el numero de celular del estudiante: ");
            celular[indice] = entrada.nextLine();
            System.out.println("====================================================");
            System.out.println("Ficha de datos");

        }
        //operacion de lectura
        int acumulador_edad = 0;
        for (int indice = 0; indice < edad.length; indice++) {
            System.out.println("Nombre: " + nombre[indice]);
            System.out.println("Edad: " + edad[indice]);
            System.out.println("Universidad: " + universidad[indice]);
            System.out.println("Número celular: " + celular[indice]);
            System.out.println("=====================================================");
            System.out.println("Nueva ficha de dato");
            acumulador_edad = acumulador_edad + edad[indice];
            System.out.println(indice);
        }
        System.out.println("Promedio de edades: " + (acumulador_edad / edad.length));

    }
}
