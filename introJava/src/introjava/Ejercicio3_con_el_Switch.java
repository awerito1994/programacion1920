/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio3_con_el_Switch {

    public static void main(String[] args) {

        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar la nota del alumno:");
        nota = entrada.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("NOTA INSUFICIENTE");
            break;

            case 5:
            case 6:
                System.out.println("NOTA SUFICIENTE");
            break;
            case 7:
            case 8:
                System.out.println("NOTA BUENA");
            break;
            case 9:
            case 10:
                System.out.println("NOTA NOTABLE");
            break;
            default:
                System.out.println("MARQUE NOTA CORRECTA POR FAVOR");
        }

    }

}
