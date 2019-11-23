/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_While_y_Do_while;

import java.util.Scanner;

/**
 *
 * @author POWER COMPUTERS
 */
public class Autenticación {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario = "awerito1";
        String contraseña = "12345";
        boolean autenticacion = false;
        
            while(!autenticacion){
            System.out.println("AUNTENTIQUESE CON SU USUARIO Y CLAVE");
            String us = entrada.next();
            String contra = entrada.next();
            
            if (usuario.equals (us) && contraseña.equals(contra)) {
                System.out.println("BIENVENIDO AL SISTEMA");
                autenticacion = true;
                
                
            }else{
                    System.out.println("Autenticacion incorrecta");
            
            }
        
        }
    }
}
