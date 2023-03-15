/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
        El programa deberá después mostrar el resultado de la suma
*/ 
        System.out.println("Ingrese un numero entero");
        Scanner leer = new Scanner(System.in);
        int numero1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero entero");
        int numero2 =leer.nextInt();
      
        int numero3 = numero1 + numero2;
        
        System.out.println(numero3);
        
       
    }
    
}
