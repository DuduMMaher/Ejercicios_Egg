/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 *Implementar un programa que le pida dos números enteros al usuario y 
 * determine si ambos o alguno de ellos es mayor a 25.

 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
    Scanner leer = new Scanner(System.in);
    
    int num1;
    int num2; 
    int num3;
    
        System.out.println("Ingrese 2 numeros enteros");
   num1= leer.nextInt();
   num2= leer.nextInt();
   
   if (num1>25) {
       num3=1;
            if (num2>25) {
                num3=2;
            }
            else {
                    if (num2>25){
                        num3=1;
                    }
            }
    }
    
}
}