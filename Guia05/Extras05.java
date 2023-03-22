/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores
 * aleatorios y muestre la suma de sus elementos.
 *
 *
 * @author dudum
 */
public class Extras05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random random = new Random();

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cant de filas de la Matriz");
        int n = leer.nextInt();
        System.out.println("Ingrese la cant de columnas de la Matriz");
        int m = leer.nextInt();

        int[][] matriz = new int[n][m];

        llenarMatriz(matriz, n, m);
        mostrarMatriz(matriz, n, m);
        int suma = sumarMatriz(matriz, n, m);
        System.out.println("");
        System.out.println("La suma total es " + suma);
        
    }

    public static void llenarMatriz(int[][] matriz, int n, int m) {
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static int sumarMatriz(int[][] matriz, int n, int m) {

        int sumar = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumar = sumar + matriz[i][j];
            }
        }
        return sumar;
    }

}
