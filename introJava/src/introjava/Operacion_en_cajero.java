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
public class Operacion_en_cajero {

    public static void main(String[] args) {
        System.out.println("CAJERO AUTOMÁTICO - BANCO DE LOJA");
        System.out.println("Digita 1 para realizar un retiro");
        System.out.println("Digita 2 para realizar un depósito");
        System.out.println("Digita 3 para realizar una consulta de saldo");
        System.out.println("Digita 0 si deseas salir");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el saldo inicial de tu cuenta");
        int saldo_cuenta = entrada.nextInt();
        System.out.println("Ingrese la opción elegida");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("OPCIÓN PARA REALIZAR UN RETIRO");
                System.out.println("Ingrese el valor a retirar");
                int retiro = entrada.nextInt();
                if (retiro <= saldo_cuenta) {
                    saldo_cuenta = saldo_cuenta - retiro;
                } else {
                    System.out.println("FONDOS INSUFICIENTES");
                }

                break;
            case 2:
                System.out.println("OPCIÓN PARA REALIZAR UN DEPÓSITO");
                System.out.println("Ingrese al valor a depositar");
                int deposito = entrada.nextInt();
                if (deposito > 0) {
                    saldo_cuenta = saldo_cuenta + deposito;
                } else {
                    System.out.println("|HEY!, está intentando depositar un valor negativo");
                }
                break;
            case 3:
                System.out.println("SALDO DE LA CUENTA");
                System.out.println("Tu saldo es: $" + saldo_cuenta);
                break;
            case 0:
                System.out.println("Ha sido un gusto atenderle");
                break;
            default:
                System.out.println("La opción seleccionada no existe");

        }
        System.out.println("Ahora tu saldo es de: $" + saldo_cuenta);
    }

}