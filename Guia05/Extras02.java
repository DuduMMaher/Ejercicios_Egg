/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 *
 * @author dudum
 */
public class Extras02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese tamaño de los vectores");

        int n = leer.nextInt();

        int cont = 0;

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];

        int r = 1;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valores del vector A");
            vectorA[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese valores del vector B");
            vectorB[i] = leer.nextInt();
        }
        System.out.println("vector A ");
        for (int i = 0; i < n; i++) {

            System.out.print(vectorA[i] + " ");

        }
        System.out.println("");
        System.out.println("vector B ");
        for (int i = 0; i < n; i++) {

            System.out.print(vectorB[i] + " ");

        }
        System.out.println("");
        cont = -1;
        do {
            cont++;
            if (cont==n) {
                break;
            }
        } while ((vectorA[cont] == vectorB[cont]));

        if (cont == n) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores NO son iguales");
        }

    }
}
