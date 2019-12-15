/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_segundo_bi;

/**
 *
 * @author POWER COMPUTERS
 */
public class ejericio_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[3];

        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print("ingrese un numero:");
            numeros[indice] = teclado.nextInt();
        }
        int mayor;
        mayor = numeros[0];

        for (int indice = 0; indice < numeros.length; indice++) {
            if (numeros[indice] > mayor) {
                mayor = numeros[indice];
            }
        }
        System.out.println("El numero mayor es:" + mayor);
    }
}
