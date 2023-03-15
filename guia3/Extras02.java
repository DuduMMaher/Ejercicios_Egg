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
public class Extras02 {

    /**Declarar cuatro variables de tipo entero A, B, C y D y asignarle un 
     * valor diferente a cada una. A continuación, realizar las instrucciones 
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome 
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y 
     * los valores finales de cada variable. Utilizar sólo una variable 
     * auxiliar.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 numeros enteros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        int num3= leer.nextInt();
        int num4= leer.nextInt();
        
        System.out.println("Variable A: " + num1);
        System.out.println("Variable B: " + num2);
        System.out.println("Variable C: " + num3);
        System.out.println("Variable D: " + num4);
        
        int numAux= num2;
        num2=num3;
        num3=num1;
        num1=num4;
        num4=numAux;
        System.out.println("Ahora");
        System.out.println("Variable A: " + num1);
        System.out.println("Variable B: " + num2);
        System.out.println("Variable C: " + num3);
        System.out.println("Variable D: " + num4);
               
        
    
    
    }
}
