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
public class Ejercicio3 {

    public static void main(String[] args) {

        int num_pares[] = new int[20];
        int pares;
        int cont = 1;

        for (int indice = 0; indice < num_pares.length; indice++) {
            while (cont <= 20) {
                if (cont % 2 == 0) {
                    pares = cont;
                    num_pares[indice] = pares;
                    int tam = num_pares.length;
                    if (indice == tam - 1) {
                        System.out.println(num_pares[indice]);

                    } else {
                        System.out.print(num_pares[indice] + ", ");
                    }

                }
                cont++;
            }

        }

    }
}
