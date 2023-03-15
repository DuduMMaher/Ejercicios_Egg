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
public class Ejercicio10 {

    /**
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e
     * imprima el número ingresado seguido de tantos asteriscos como indique su
     * valor. Por ejemplo: 5 ***** 3 *** 11 *********** 2 **
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int num1=0;
        
        System.out.println("Ingrese cuatro numeros");
        while (num1<0 || num1>20){
        num1 = leer.nextInt();
        }
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();

        System.out.print(num1);

        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num2);

        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num3);

        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num4);

        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
