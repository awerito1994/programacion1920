/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Ejercicio3_con_el_if {

    public static void main(String[] args) {
        double nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar la nota del alumno");
        nota = entrada.nextDouble();
        if (nota >=0 && nota<=10) {
            System.out.println("aqui");
            if (nota>0 && nota <=4.9) {
                System.out.println("La nota del alumno es insuficiente. ");
            }else if(nota>=5 && nota<=6.9) {
                System.out.println("La nota del alumno es suficiente.");
                    
            }else if (nota >=7 && nota <=8.9){
                System.out.println("La nota del alumno es buena.");
            }else if(nota>=9 && nota<=10){
                System.out.println("La nota del alumno es notable.");
                
            }
             
            
        }

   
    }
}
