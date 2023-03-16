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
public class Extras10 {

    /**Realice un programa para que el usuario adivine el resultado de una 
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
     * El programa debe indicar al usuario si su respuesta es o no correcta. 
     * En caso que la respuesta sea incorrecta se debe permitir al usuario 
     * ingresar su respuesta nuevamente. Para realizar este ejercicio 
     * investigue como utilizar la función Math.random() de Java.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Scanner leer = new Scanner(System.in);
        
    double num1 = (Math.random())*10;
    double num2 = (Math.random())*10;
    
    int num5 = (int)num1 * (int)num2;
    
        System.out.println(num5);
        
    int num6=0;
        do {
            System.out.println("Ingrese el resultado");
            num6 = leer.nextInt();
            if (num6!=num5) {
                System.out.println("Resultado INCORRECTO");
            }
        } while (num6!=num5);
        
        System.out.println("RESULTADO CORRECTO");
    }
}
