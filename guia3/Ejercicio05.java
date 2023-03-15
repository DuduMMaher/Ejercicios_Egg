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
public class Ejercicio05 {

    /**Escriba un programa en el cual se ingrese un valor limite positivo, 
     * y a continuacion solicite numeros al usuario hasta que la suma de 
     * los numeros introducidos supere el limite inicial.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un numero limite");
    
        int lim = leer.nextInt();
        int num;
        int suma=0;
        do {
           
            System.out.println("Ingrese un numero a sumar");
            num=leer.nextInt();
            suma =suma+num;
        } while (suma < lim);
        System.out.println("La suma es " + suma);
    }
}
