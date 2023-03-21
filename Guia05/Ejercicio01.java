/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

/**
 *
 * @author dudum
 */
public class Ejercicio01 {

    /**Realizar un algoritmo que llene un vector con los 100 primeros números 
     * enteros y los muestre por pantalla en orden descendente.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    int[] numeros = new int[100];
    
        for (int i = 0; i < 100; i++) {
            numeros[i]=i+1;
        }
    
        for (int i = ((numeros.length)-1); i >-1; i--) {
            System.out.println(numeros[i]);
        }
    
    
    } 
}
