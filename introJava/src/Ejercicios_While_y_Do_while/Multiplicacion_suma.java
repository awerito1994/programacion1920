/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_While_y_Do_while;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Multiplicacion_suma {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int acumulador = 0;
        int contador = 1;
        int numero2;
        int numero1;
        System.out.println("Ingrese un número");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        numero2 = entrada.nextInt();

        while (contador <= 2) {
            acumulador = acumulador + numero1;
            contador = contador + 1;

        }
        System.out.println("La respuesta es; " + acumulador);
    }
}
