/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidimensionales_2020;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int bina = 0;
        int suma = 0;
        System.out.print("Ingrese el número de digitos: ");
        int num = entrada.nextInt();
        int[] binario = new int[num];

        for (int indice = binario.length - 1; indice >= 0; indice--) {
            System.out.print("Ingrese un valor al digito: ");
            binario[indice] = entrada.nextInt();
        }

        for (int ind = binario.length - 1; ind >= 0; ind--) {
            bina = (binario[ind] * 2 ^ ind);
            suma = suma + bina;

        }
        for (int i = binario.length - 1; i >= 0; i--) {
            System.out.print("El termino ingresado es: " + binario[i] + "; La posición que se encuentra es en: " + i);
            System.out.println("");
        }
        System.out.println("El número decimal es: " + bina);
        System.out.print("El número decimal es: " + suma);

    }

}
