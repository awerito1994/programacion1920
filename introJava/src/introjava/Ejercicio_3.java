/*
 En este clase vamos a realizar el ejercicio numero 3
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio_3 {

   
    public static void main(String[] args) {
         //1. Calcular valores de X - Y
        double X;
        double Y;
      
        System.out.println("Ingresar un valor para X");
        Scanner entrada = new Scanner(System.in);
        X = entrada.nextInt();
        
        if (X< 0) {
            Y = (3 * X) + 6;
            System.out.println("el valor de Y es:" + Y);
        } else {
            if (X>= 0) {
                Y = (Math.pow(X, 2)) + 6;
                System.out.println("El valor de Y es:" + Y);

            }
        }

    }

}
