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
public class Ejercicio8 {

    public static void main(String[] args) {
        int numeros[] = new int[25];
        int mayores = 0;
        int menores = 0;
        int iguales = 0;

        Scanner datos = new Scanner(System.in);
        for (int cont = 0; cont < numeros.length; cont++) {
            System.out.print("Ingrese un numero: ");
            numeros[cont] = datos.nextInt();
        }
        for (int ndice = 0; ndice < numeros.length; ndice++) {
            if (numeros[ndice] == 0) {
                iguales++;
            } else {
                if (numeros[ndice] < 0) {
                    menores++;
                }
                if (numeros[ndice] > 0) {
                    mayores++;
                }
            }
            System.out.print(numeros[ndice] + " ");
        }
        System.out.println("Resultado Final");
        System.out.println("----------------------------------------------------");
        System.out.println("numeros mayores que cero:  " + mayores);
        System.out.println("numeros menores que cero:  " + menores);
        System.out.println("numeros iguales que cero:  " + iguales);
        
        
    }
}
