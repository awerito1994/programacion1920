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
public class Ejercio2_cual_es_mayor {

    public static void main(String[] args) {

        double numero1;
        double numero2;
        System.out.println("NÚMEROS PERFECTOS");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingresar el primer número; ");
        numero1 = entrada.nextDouble();
        System.out.println("Por favor ingresar el segundo número: ");
        numero2 = entrada.nextDouble();
        if (numero1 == numero2) {
            System.out.println("Los numeros ingresados son iguales ");

        } 
        else  if (numero2 > numero1) 
            System.out.println("El número 2 es mayor:" + numero2);
        else
            System.out.println("El número mayor es: " +numero1);
            }
        }
    

