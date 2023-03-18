/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia04;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Ejercicio04 {

    /**
     * Crea una aplicación que nos pida un número por teclado y con una función
     * se lo pasamos por parámetro para que nos indique si es o no un número
     * primo, debe devolver true si es primo, sino false. Un número primo es
     * aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es
     * primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero a revisar si es primo");
        int num1 = leer.nextInt();

        
        
        if (analisis(num1)) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
    
    public static boolean analisis(int a){
        boolean primo;
        
        if ((a==1)||(a==2)||(a==3)) {
            primo=true;
            return primo;
        }
        
        if (a%2==0) {
            primo=false;
            return primo;
        }
        int c= ((int)a/2);
        for (int i = 3; i < c; i=i+2) {
            if (a%i==0) {
                primo= false;
                return primo;
                
            }
            
        }
        primo=true;
        return primo;
    }
}
