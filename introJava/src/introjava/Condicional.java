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
public class Condicional {
   
    public static void main(String[] args) {
        System.out.println("Programa para determinar si una persona es mayor de edad");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        if (edad >= 18) {
            System.out.println("ERES MAYOR DE EDAD: tienes " + edad +" años");
            
            
        }else {//caso de que no se cumpla la primera condición
            System.out.println("AÚN ERES MENOR DE EDAD: solo tienes " + edad + " años");
        }
    }
}