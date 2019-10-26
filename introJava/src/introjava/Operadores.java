package introjava;

/*
 Esta clase va ha servir para trabajar con las distintas clases de operadores
 en java
 */

/**
 *
 * @author Salas
 */
public class Operadores {
    
    public static void main(String[] args) {
        //1.OPERADORES ARITMETICOS
        int suma = 14 + 14;
        int resta = 20 - 10;
        double multiplicacion  = 50 * 0.12;
        int division = 100 / 50;
        int residuo = 7 % 2;
        System.out.println("1. OPERADORES ARITMETICOS");
        System.out.println("La suma es:" + suma);
        System.out.println("La resta es;" + resta);
        System.out.println("La multiplicacion es;" + multiplicacion);
        System.out.println("La division es;" + division);
        System.out.println("El residuo es;" + residuo);
        
        
        //2. OPERADORES DE INCREMENTO Y DECREMENTO
        int nota = 15;
        nota = nota + 1;
        System.out.println("2. OPERADORES DE INCREMENTO Y DECREMENTO");
        System.out.println("Incremento como nota = nota + 1: " + nota );
        nota +=1;
        System.out.println("Incremento como nota +=1 : " + nota);
        nota++;
        System.out.println("Incremento como nota++ :" + nota);
        
        nota = nota - 1;
        System.out.println("decremento de la variable nota");
        System.out.println("Decremento como nota = nota - 1:" + nota);
        nota -=1;
        System.out.println("Decremento como nota -=1: " + nota);
        nota -- ;
        System.out.println("Decremento como nota--:" + nota);
        
    }
    
   
}
