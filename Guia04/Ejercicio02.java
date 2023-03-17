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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    /*Diseñe una función que pida el nombre y la edad de N personas e imprima 
    los datos de las personas ingresadas por teclado e indique si son mayores 
    o menores de edad. Después de cada persona, el programa debe preguntarle 
    al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
    ingrese la palabra “No”.
*/
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner leer = new Scanner(System.in);
        
        String opc;
        String nombre;
        int edad;
        
        do {
        
        System.out.println("Ingrese el nombre de la persona");
        
       nombre = leer.next();
       
        System.out.println("Ingrese la edad");
        edad= leer.nextInt();
       
        consultas(nombre, edad);
        
            System.out.println("Desea ingresar otra persona? S/N");
            opc=leer.next();
            
    } while (opc.equalsIgnoreCase("S"));
    
        }
    
    public static void consultas(String a, int b){
        String cond;
       
        if (b<18) {
            cond="MENOR";
        } else {
            cond="MAYOR";
        }
        
        System.out.println("El nombre es " + a);
        System.out.println("tiene " + b + " años");
        System.out.println("lo que implica que es " + cond + " de edad");
    }
    
    
}
