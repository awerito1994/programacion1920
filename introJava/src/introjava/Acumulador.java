/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author Salas
 */
public class Acumulador {
    public static void main(String[] args) {
        System.out.println("Trabajando con acumuladores.");
        int contador = 1;
        int acumulador = 1;// va a acumular la suma de los números del 1 al 5.
        while(contador <= 5){
            acumulador = acumulador * contador;
            contador++;
        }
        System.out.println("Valor del contador " + contador);
        System.out.println("Valor del acumulador " + acumulador);
    }
    
}
