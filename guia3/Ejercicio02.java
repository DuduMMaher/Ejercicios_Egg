/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
 * Incorrecto. Nota: investigar la función equals() en Java.

 *
 * @author dudum
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese una palabra");
    
    String frase =leer.nextLine();
    
    if (frase.equalsIgnoreCase("eureka")){
         System.out.println("La frase es correscta");   
    } else {
        System.out.println("La palabra es incorrecta");
    }
    }
    
}
