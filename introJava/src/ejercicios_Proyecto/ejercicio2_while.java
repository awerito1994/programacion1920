/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_Proyecto;



/**
 *
 * @author POWER COMPUTERS
 */
public class ejercicio2_while {

    public static void main(String[] args) {
      int it = 1;
        int cont = 0;
        int num = 1;
        int suma_div = 0;
       

        System.out.println("Los 4 primeros números perfectos son: ");
        while (cont < 4) {
            while (it < num) {
                if ((num % it) == 0) {
                    suma_div +=  it;
                }
                it++;
            }
            
            if(suma_div==num){
                System.out.println("El siguiente número es numero perfecto: "+num);
                cont++;
            }
            suma_div=0;
            it=1;
            num++;
        }
        System.out.println("");
    
    }
}