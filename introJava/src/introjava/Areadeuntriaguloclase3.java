/*
 Aquí vamos a calcular la area de un triángulo
 */
package introjava;
import java.util.Scanner;
        

/**
 *
 * @author POWER COMPUTERS
 */
public class Areadeuntriaguloclase3 {
    
    public static void main(String[] args) {
        
        double area;
        double base;
        double altura;
        
        System.out.println("Ingrese la base");
        Scanner entrada=new Scanner (System.in);
        base=entrada.nextDouble();
        
        System.out.println("Ingrese la altura");
        Scanner entrada1=new Scanner (System.in);
        altura=entrada1.nextDouble();
        
        area=(base*altura)/2;
        
        
        System.out.println("El area del triangulo es: " + area);
        
    }
    
}
