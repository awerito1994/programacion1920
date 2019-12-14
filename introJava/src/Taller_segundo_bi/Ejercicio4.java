/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_segundo_bi;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int arreglo1[] = new int[5];
        int arreglo2[] = new int[5];
        int arreglo3[] = new int[5];
        int suma = 0;
        int numero;
        Scanner entrada = new Scanner(System.in);

        for (int indice = 0; indice < 5; indice++) {
            System.out.print("Ingrese valores al arreglo uno: ");
            numero = entrada.nextInt();
            arreglo1[indice] = numero;

        }
        System.out.println("=========================================");
        for (int ind = 0; ind < 5; ind++) {
            System.out.print("Ingrese valores al arreglo dos: ");
            numero = entrada.nextInt();
            arreglo2[ind] = numero;

        }
        int arreglo_sum = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo_sum = arreglo_sum + arreglo1[i];
            System.out.print(arreglo1[i] + " "+ ", ");
        }
        System.out.println(" ");
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo_sum = arreglo_sum + arreglo2[i];
            System.out.print(arreglo2[i] + " " +", ");

        }

        for (int ind = 0; ind < arreglo3.length; ind++) {
            arreglo3[ind] = arreglo1[ind] + arreglo2[ind];
            System.out.println("" );
            System.out.print(arreglo3[ind]);
           

        }

    }

}
