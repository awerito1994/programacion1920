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
public class Ejercicio3 {

    public static void main(String[] args) {

        int numeros[] = new int[30];
        Scanner datos = new Scanner(System.in);
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print("Ingrese un numero: ");
            numeros[indice] = datos.nextInt();
        }
        int num_mayor = 0;
        int num_menor = 0;
        int repeticion1 = 0;
        int repeticion2 = 0;
        num_mayor = num_menor = numeros[0];
        for (int ind = 0; ind < numeros.length; ind++) {
            if (numeros[ind] == num_mayor) {
                repeticion1++;

            }
            if (numeros[ind] == num_menor) {
                repeticion2++;

            }
            if (numeros[ind] < num_menor) {

                num_menor = numeros[ind];
            }

            if (numeros[ind] > num_mayor) {

                num_mayor = numeros[ind];

            }

        }
        System.out.println("El numero mayor es:  " + num_mayor);
        System.out.println("El numero menor es:  " + num_menor);
        System.out.println("El numero repetido mayor es: : " + repeticion1);
        System.out.println("El numero repetido menor es: : " + repeticion2);
    }
}
