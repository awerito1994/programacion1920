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
public class Contador_while {
    public static void main(String[] args) {
        System.out.println("TRABAJANDO CON CONTADORES");
        //Inicializar nuestro contador
        int contador = 1;
        //Vamos a repetir 5 veces un proceso
        while(contador <= 5){
            System.out.println("contador " +contador);
            contador = contador +1 ;//Incremento de la variable contador en 1
        }
        
    }
    
}
