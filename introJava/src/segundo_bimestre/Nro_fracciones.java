/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo_bimestre;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Nro_fracciones {

    public static void main(String[] args) {

        int limite;
        int cont = 1;
        int num = 1;
        int num2 = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un limite de la serie");
        limite = entrada.nextInt();
        while (cont <= limite) {
            cont++;
            num2++;

            System.out.print(+num + "/" + num2 + " + ");

        }

    }
}
