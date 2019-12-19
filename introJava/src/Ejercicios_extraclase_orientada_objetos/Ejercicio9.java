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
public class Ejercicio9 {
    public static void main(String[] args) {
        
        int num[] = new int[4];
        int cont = 0;
        Scanner teclado = new Scanner(System.in);

        for (int indice = 0; indice < num.length; indice++) {
            System.out.print("ingresar un numero por favor: ");
            num[indice] = teclado.nextInt();
        }

        for (int ind = 0; ind < num.length-1; ind++) {
            for (int j = ind + 1; j < num.length; j++) {
                if (num[ind] < num[j]) {
                    cont = num[ind];
                    num[ind] = num[j];
                    num[j] = cont;

                }

            }

        }
        
        System.out.println("--------------------------------------------");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] +",");
            
        }

    }
    }
    

