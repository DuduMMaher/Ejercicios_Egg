/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Ejercicio8 {

    /**
     * Escriba un programa que valide si una nota está entre 0 y 10, 
     * sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la 
     * nota sea correcta.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una nota");    
     int nota=11;   
     while (nota>10 || nota<0) {
     nota = leer.nextInt();
       }      
        
    }
    
}
