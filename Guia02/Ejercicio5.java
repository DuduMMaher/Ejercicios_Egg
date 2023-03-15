/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y
    muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un Numero entero");

        int numero = leer.nextInt();

        double numero2 = Math.sqrt(numero);
        System.out.println(numero * 2);
        System.out.println(numero * 3);
        System.out.println(numero2);

    }

}
