/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**Realizar un algoritmo que calcule la suma de todos los elementos de un 
 * vector de tamaño N, con los valores ingresados por el usuario.

 *
 * @author dudum
 */
public class Extras01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        
        int n =leer.nextInt();
        int suma=0;
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un valor para completar el vector ");
            vector[i]= leer.nextInt();
        }
        
        
        
        for (int i = 0; i < n; i++) {
            suma=+ vector[i];
            
        }
        
        System.out.println("La suma es " + suma);
    
    
    
    
    
    }
}
