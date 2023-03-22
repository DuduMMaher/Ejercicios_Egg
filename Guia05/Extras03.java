/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;

/**Crear una función rellene un vector con números aleatorios, pasándole un 
 * arreglo por parámetro. Después haremos otra función o procedimiento que 
 * imprima el vector.
 *
 * @author dudum
 */
public class Extras03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int n=10;
    int[] vectorA = new int[n];
    
    llenarVector(vectorA, n);
    
    imprimirVector(vectorA, n);
    
    
    
    
    
    
    
    }


public static void llenarVector(int[] vectorA, int n){

Random random = new Random();

    for (int i = 0; i < n; i++) {
        vectorA[i]= random.nextInt(100);
    }


}

public static void imprimirVector(int[] vectorA, int n){
    
    for (int i = 0; i < n; i++) {
        System.out.print(vectorA[i] + " | ");
    }
    System.out.println("");

}



}

