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
public class Triangulo_asteristico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int contador = 1;     
        String asterisco = "";
         while(contador<=numero){
            asterisco = asterisco +"*";
            System.out.println(asterisco);
            contador++;
            
            
        }
            
    }
    
}
