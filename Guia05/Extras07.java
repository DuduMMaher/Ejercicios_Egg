/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Extras07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de n en Fibonacci");
        int n = leer.nextInt();
        int[] fibon = new int[n];

        if (n == 1) {
            fibon[0] = 1;
        } else {
            fibon[0] = 1;
            fibon[1] = 1;
        }
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                fibon[i] = fibon[(i - 2)] + fibon[(i - 1)];
            }
        }
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                System.out.print(" " + fibon[i] + " ");
            }
            System.out.println("");
        } else {
            System.out.println(fibon[0]);
        }
    }
}
