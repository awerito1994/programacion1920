/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_16_01_2020;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Numero_perfecto {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //System.out.println("Ingrese el limite para determinar los numeros perfectos");
        //int perfecto = datos.nextInt();
        Determinar_Perfecto(10000);
    }

    /**
     * Metodo para encontrar los numeros perfectos
     *
     * @param num --> es el limite al que vamos a buscar cuantos numeros
     * perfectos existen
     */
    public static void Determinar_Perfecto(int num) {
        int contador = 0;
        int div = 0;
        int suma = 0;
        int suma2 = 0;
        System.out.println("");
        System.out.println("NÚMEROS PERFECTOS");
        System.out.println("======================");
        while (contador <= num) {
            contador++;
            for (contador = 1; contador <= num; contador++) {
                suma = 0;
                for (div = 1; div < contador; div++) {
                    if (contador % div == 0) {
                        suma = suma + div;
                    }

                }
                if (contador == suma) {
                    System.out.println(div);
                    System.out.println("======================");
                    suma2 = suma2 + contador;

                }

            }
            System.out.println("La suma de los números perfectos es:" + suma2);
        }

    }

}
