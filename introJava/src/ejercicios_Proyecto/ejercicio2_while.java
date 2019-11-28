/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Proyecto;

/**
 *
 * @author POWER COMPUTERS
 */
public class ejercicio2_while {
    public static void main(String[] args) {
        int cont = 1;
        int acumulador = 1;
        int suma;
        int max = 10000;
        System.out.println("LOS 4 PRIMEROS NUMEROS PERFECTOS ");
        System.out.println("_____________________________________________________");
        while (cont <= max) {
            
            for (cont = 1; cont <= 10000;) {    // contador es el número que vamos a comprobar
                cont++;
                suma = 0;
                for (acumulador = 1; acumulador < cont; acumulador++) {  // Amcumulador son los divisores. Se divide desde 1 hasta contador-1
                    
                    if (cont % acumulador == 0) {
                        suma = suma + acumulador;     // si es divisor se suma
                    }
                }
                if (cont == suma) {           // si el numero es igual a la suma de sus divisores es perfecto
                    System.out.println("El siguiente numero es un numero perfecto :" + cont);
                    
                           
                }
            }
        }
    }
    }
    