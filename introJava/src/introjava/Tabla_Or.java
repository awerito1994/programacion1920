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
public class Tabla_Or {

    public static void main(String[] args) {
        System.out.println("TABLA DE VERDAD OR ");
        System.out.println("x \t y \t resultado");
        
        System.out.println("___________________________");
        System.out.println("y \t V \t" + (true || true));
        System.out.println("___________________________");
        System.out.println("y \t F \t" + (true || false));
        System.out.println("___________________________");
        System.out.println("F \t V \t" + (false || true));
        System.out.println("___________________________");
        System.out.println("F \t F \t" + (false || false));
        System.out.println("___________________________");

        System.out.println("TABLA DE VERDAD NOT");
        System.out.println("x \t resultado");
        System.out.println(true + "\t" + !true);
        System.out.println(false + "\t" + !false);

    }

}
