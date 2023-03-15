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
public class Ejercicio08 {

    /**Dibujar un cuadrado de N elementos por lado utilizando el carácter 
     * “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se 
     * deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *


     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer=new Scanner(System.in);
    
        System.out.println("Ingrese lado del cuadrado");
    
       int lado=leer.nextInt();
       for (int i=0; i<lado; i++){
           if ((i==0) || (i==lado-1)){
               for (int j=0; j<lado; j++){
                   System.out.print("*");
               }
               System.out.println("");
               } else 
               {
                       System.out.print("*");
                       for (int k=1; k<(lado-1); k++){
                           System.out.print(" ");
                       }
                       System.out.println("*");
                       }
           }
       }
    
    
    
    
    
    }
