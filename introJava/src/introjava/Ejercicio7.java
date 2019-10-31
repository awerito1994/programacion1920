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
public class Ejercicio7 {

    // 1.PROMEDIO DE UN ESTUDIANTE
    public static void main(String[] args) {
        Scanner informacion = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double promedio;
        String Aprobado, Aprobado1;
        System.out.println("Ingrese un nombre");
        String mi_nombre = informacion.nextLine();
        System.out.println("Ingrese la calificacion del primer parcial:");
        nota1 = informacion.nextDouble();
        System.out.println("Ingrese la calificacion del segundo parcial:");
        nota2 = informacion.nextDouble();
        System.out.println("Ingrese la calificacion del tercer parcial:");
        nota3 = informacion.nextDouble();

        System.out.println("NOMBRE \t\t\t" + mi_nombre);
        System.out.println("Primer Parcial \t\t  " + nota1);
        System.out.println("Segundo Parcial \t  " + nota2);
        System.out.println("Tercer Parcial \t\t  " + nota3);
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio\t\t  " + promedio);

        System.out.println(" NOTA FINAL");
        if (promedio >= 70) {
            System.out.println(" El estudiante " + mi_nombre + " en este periodo academico\n obtuvo una calificacion de " + promedio
                    + " por lo tanto aprobo\n el ciclo Academico");
            Aprobado = "Si";
            System.out.println(" Aprobado--->\t" + Aprobado);
        } else {
            if (promedio < 70) {
                System.out.println(" El estudiante " + mi_nombre + " no aprobo el Ciclo Academico");
                Aprobado1 = "NO";
                System.out.println(" Aprobado1--->\t" + Aprobado1);
            }
        }
    }
}
