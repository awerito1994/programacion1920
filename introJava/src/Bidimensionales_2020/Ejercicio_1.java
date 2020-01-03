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
public class Ejercicio_1 {

    public static void main(String[] args) {
        int cedula[] = new int[10];
        int coeficiente[] = {2, 1, 2, 1, 2, 1, 2, 1, 2, 1};
        int decimal1 = 0;
        int decimal2 = 0;
        int decimal3 = 0;
        int decimal4 = 0;
        int decimal5 = 0;
        int decimal6 = 0;
        int comp1 = 0;
        int comp2 = 0;
        int total1 = 0;
        int total2 = 0;
        int total = 0;
        int tot2 = 0;
        int tot3 = 0;
        int total3 = 0;

        int respuesta[] = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int indice = 0; indice < cedula.length; indice++) {
            System.out.print("ingrese su número de cédula, digito por digito por favor: ");
            cedula[indice] = entrada.nextInt();

        }
        for (int ind = 0; ind < cedula.length; ind++) {
            total1 = coeficiente[ind] * cedula[ind];
            respuesta[ind] = total1;

            System.out.println("El resultado es: " + total1);

        }

        for (int i = 0; i < 10; i++) {
            respuesta[i] = total1;

            respuesta[i] = coeficiente[i] * cedula[i] + (cedula[9] * 0);
            total2 += respuesta[i];
            total3 = total2 - cedula[9];

        }

        for (int i = 0; i < 10; i++) {
            if (respuesta[i] >= 10) {
                tot2 = tot2 + 1;
                tot3 = tot2 * 9;
                total = total3 - tot3;

            }
        }
        System.out.println("el total es: " + total);

        decimal1 = total / 10;
        decimal2 = decimal1 + 1;
        decimal3 = decimal2 * 10;
        comp1 = decimal3 - total;
        System.out.println("la resta es: " + comp1);

        if (comp1 == cedula[9] || cedula[9] == 0) {
            System.out.println("El número de cédula que digitó es correcto. Gracias");

        } else {
            System.out.println("El número de cédula que digitó no correcto, por favor+"
                    + "ingrese un número de cédula correcto");
        }

        if (total1 >= 10) {
            System.out.println(+total3);
            decimal4 = total3 / 10;
            decimal5 = decimal4 + 1;
            decimal6 = decimal5 * 10;
            comp1 = decimal6 - total3;
            if (comp1 == cedula[9]) {
                System.out.println("El número de cédula es correcto.");

            } else {
                System.out.println("El número de cédula que ingresó no es el correcto, ingrese por favor+"
                        + "nuevamente un número de cédula correcto: ");
            }
        }

    }
}
