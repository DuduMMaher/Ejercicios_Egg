/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;
import java.util.Scanner;

/** Realizar un algoritmo que llene un vector de tamaño N con valores 
 * aleatorios y le pida al usuario un número a buscar en el vector. 
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 *
 * @author dudum
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("Ingrese el tamano del vector");
        
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        int n = leer.nextInt();
        
        
       
        int[] vector=new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=random.nextInt(100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " / ");
        }
        System.out.println("");
        
        System.out.println("Ingrese un numero a buscar");
        
        int numUsuario= leer.nextInt();

        int cont=0;
        for (int i = 0; i < n; i++) {
            if (vector[i]==numUsuario) {
                System.out.println("Su numero esta en el elemento " + (i+1));
            cont++;
            } 
                
            
        }
        if (cont==0) {
            System.out.println("Su numero no esta en el vector");
        }
       
    }
}
