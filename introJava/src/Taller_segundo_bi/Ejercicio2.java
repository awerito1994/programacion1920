/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_segundo_bi;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        char arreglo1[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        char arreglo2[] = {'g', 'h', 'i', 'j', 'k'};
        char arreglo3[] = new char[11];

        for (int indice = 0; indice < 6; indice++) {
            arreglo3[indice] = arreglo1[indice];

        }
        for (int ind = 6; ind < 11; ind++) {

            arreglo3[ind] = arreglo2[ind - 6];

        }
        for (int i = 0; i < 11; i++) {
            int tam = arreglo3.length;
            if (i == tam - 1) {
                System.out.println(arreglo3[i]);

            } else {
                System.out.print(arreglo3[i] + ", ");
            }

        }
    }
}
