/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Proyecto;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio1_con_Do_While {

    public static void main(String[] args) {

        double numero;
        int cont = 0;
        double total = 0;
        double acum = 0;
        boolean opcion = true;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Usted desea ingresar un nuevo numero: Si/ No:");
            String respuesta = entrada.next();
            respuesta = respuesta.toLowerCase();

            if (respuesta.equals("si")) {
                System.out.println("Ingrese por favor un nuevo numero: ");
                numero = entrada.nextDouble();
                cont++;
                acum = acum + cont;
                total = (acum / cont);
            } else if (respuesta.equals("no")) {
                opcion = false;

            }

        } while (opcion == true);
        System.out.println("El promedio de los numeros es : " + total);

    }
}
