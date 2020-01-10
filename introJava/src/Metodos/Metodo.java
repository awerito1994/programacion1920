/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Metodo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        //determinar_si_es_par(num);
        String msj = determinar_si_es_par_v2(num);//Recibimos el valor que retorna el método
        System.out.println(msj);

    }

    /**
     * Es un método que si retorna un valor Este método sirve para determinar si
     * un número es par o no.
     *
     * @param numero
     * @return
     */
    public static String determinar_si_es_par_v2(int numero) {
        String mensaje = "";
        if (numero % 2 == 0) {
            mensaje = "Es par";
        } else {
            mensaje = "No es par";
        }
        return mensaje;

    }

    /**
     * Es un método que no retorna ningún valor Este método sirve para
     * determinar si un número es par o no.
     *
     * @param numero es el valor que se evalúa para determinar si es par o no.
     */
    public static void determinar_si_es_par(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Si es par");
        } else {
            System.out.println("No es par");
        }

    }
}
