/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo_bimestre;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Numero_filas {
    public static void main(String[] args) {
        
      
        int num;
        int cont =1;
        String pascal = "";
        Scanner entrada = new  Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = entrada.nextInt();
        System.out.println("----------------------------------------");
        while(cont <= num){
            pascal += cont +",";
            System.out.println(""+pascal);
            cont++;
        }
                
    }
    
}
