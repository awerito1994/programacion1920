/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class selección_múltiple {

    public static void main(String[] args) {
        System.out.println("Empleo de las sentencias switch");
        System.out.println("Programa para determinar si un caracter"
                + "ingresado por teclado es una vocal");
        Scanner entrada = new Scanner(System.in);
        char letra = entrada.next().charAt(0);
        switch (letra) {//se evalúan variables tipo char e int
            case 'a': case'e': case'i': case'o': case 'u':
            case 'A': case'E': case'I': case'O': case 'U':
                System.out.println("Es una vocal" + letra);
                break;
            default:
                System.out.println(letra + ", No es una vocal");
        }

    }
}
