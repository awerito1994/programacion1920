/*

En esta clase vamos a realizar ecuaciones con la fórmula general
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Formula_general {

    public static void main(String[] args) {
        //1. Operando con formula general
        int a;
        int b;
        int c;
        double X1;
        double X2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar valor a: ");
        a = entrada.nextInt();
        System.out.println("Ingresar valor a b: ");
        b = entrada.nextInt();
        System.out.println("Ingresar valor a c: ");
        c = entrada.nextInt();
        
        X1=(-b + Math.sqrt ((b * b)- (4*a*c))) / (2*a);
        System.out.println(" Valor de X1: " + X1);
        X2=(-b + Math.sqrt ((b * b)- (4*a*c))) / (2*a);
        System.out.println("Valor de X2: " + X2);
        
        
        
        

    }
}
