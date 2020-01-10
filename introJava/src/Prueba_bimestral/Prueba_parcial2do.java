/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba_bimestral;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Prueba_parcial2do {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int num = teclado.nextInt();
        int numeros[] = new int[num];
        int cuadrados[] = new int[num];
        int suma = 0;
        int par = 0;
        for (int ind = 0; ind < num; ind++) {
            System.out.println("Ingrese un numero");
            numeros[ind] = teclado.nextInt();

        }
        System.out.println("NUMEROS");
        for (int ind = 0; ind < numeros.length; ind++) {
            System.out.println(numeros[ind] + " ");

        }
        //procesos para mostrar las operaciones
        System.out.println();
        System.out.println("PROCESOS");
        for (int ind = 0; ind < cuadrados.length; ind++) {
            System.out.println(numeros[ind] + " " + numeros[ind] + "  ");

        }
        //proceso de elevear al cuadrado
        System.out.println();
        for (int indice = 0; indice < numeros.length; indice++) {
            cuadrados[indice] = (int) Math.pow(numeros[indice], 2);

        }
        //Mostramos el proceso ya calculados
        System.out.println("CUADRADOS");
        for (int i = 0; i < cuadrados.length; i++) {
            System.out.println(cuadrados[i] + " ");

        }
        System.out.println();
        for (int ind = 0; ind < numeros.length; ind++) {
            if (numeros[ind] % 2 == 0) {
                suma = suma + numeros[ind];

            }

        }
        System.out.println("La suma de sus pares es: ");
        for (int i = 0; i < 1; i++) {
            System.out.println(suma);

        }
        System.out.println("");
        System.out.println("La suma es" + suma);
        System.out.println("");
        System.out.println("La suma es " + suma);

    }

}
