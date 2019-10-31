/*
 Vamos a realizar el ejercicio 5 sobre un cliente en su pedido
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        //1.Hojas de hielo, viguetas y armazones

        int hojas;
        int viguetas;
        int armazones;
        double pH = 100;
        double pV = 50;
        double pA = 40;

        System.out.println("Ingresar el valor de cantidad de hojas de hielo seco: ");
        Scanner entrada = new Scanner(System.in);
        hojas = entrada.nextInt();

        System.out.println("Ingresar el valor de viguetas: ");
        Scanner entrada1 = new Scanner(System.in);
        viguetas = entrada.nextInt();

        System.out.println("Ingresar el valor de armazones: ");
        Scanner entrada2 = new Scanner(System.in);
        armazones = entrada.nextInt();

        double costo = ((hojas * pH) * (1 - 0.20)) + ((viguetas * pV) * (1 - 0.15)) + (armazones * pA);
        System.out.println("Ingresar el valor de tipo de pago: ");
        System.out.println("1. Al contado: ");
        System.out.println("2. A credito; ");
        System.out.println(" : ");

        

        int n = entrada.nextInt();
        double precio;
        if (n > 0 & n < 2) {
            precio = costo * (1 - 0.07);
            System.out.println("El precio total del producto es " + precio);
        } else {
            precio = costo;
            System.out.println("El precio total del producto es " + precio);
            

        }

    }
}
