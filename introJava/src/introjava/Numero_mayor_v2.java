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
public class Numero_mayor_v2 {

    public static void main(String[] args) {

        int n1 = 20;
        int n2 = 20;
        int n3 = 10;

        //ifs anidados
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("n1 es el mayor");

            } else {
                System.out.println("n3 es el mayor");
            }

        } else if (n2 > n3) {
            System.out.println("n2 es el mayor");
        } else {
            System.out.println("n3 es el mayor");
        }
    }

}
