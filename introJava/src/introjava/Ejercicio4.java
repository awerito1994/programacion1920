/*
 Calculo del ejercicio 4
 */
package introjava;

import java.util.Scanner;
/**
 *
 * @author POWER COMPUTERS
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        double precio_U;
        double precio;
        double descuento ;
        int cantidad;
        String producto ;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el producto; ");
        producto = dato.nextLine();
        System.out.println("Ingrese la cantidad de pedidos a realizar: ");
        cantidad = dato.nextInt();
        System.out.println("Ingrese el precio por unidad: ");
        precio_U= dato.nextDouble();
        precio = cantidad * precio_U;
        System.out.println("El precio del articulo: " + precio_U);  
        if(cantidad >= 50){
            descuento = precio * 0.15;
            System.out.println("El precio con descuento es: "+ descuento);
        }  
        if (precio < 1){
                System.out.println("es\t" + precio +"centavos");
        }else{
            System.out.println("precio normal es\t"+precio + "Dolares");
        }
        }       
}

