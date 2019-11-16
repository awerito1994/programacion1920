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
public class numeros_iguales {
    public static void main(String[] args) {
        
        double numero1;
        double numero2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingresar el primer número; ");
        numero1 = entrada.nextDouble();
        System.out.println("Por favor ingresar el segundo número: ");
        numero2 = entrada.nextDouble();
        if (numero1 == numero2) {
            System.out.println("Los numeros ingresados son iguales ");
            
            
        }else
            System.out.println("Los números ingresados no son iguales");
        
    }
}
