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
public class Tabla_de_multiplicar {
    public static void main(String[] args) {
        System.out.println("GENERACIÓN DE TABLA DE MULTIPLICAR ");
        System.out.println("Ingresa el número para generar tabla"
                + "de multiplicación: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int cnt = 1 ;
        while(cnt <= 10){
            System.out.println(numero + " x " + cnt + " = " +numero*cnt);
            cnt++;
            
        }
    }
    
}
