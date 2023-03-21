/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 *
 * @author dudum
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] prueba = new int[80];
        int cont = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un numero para llenar la matriz");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                prueba[cont] = prueba[cont] + matriz[i][j];
            }
            cont++;
        }
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                prueba[cont] = prueba[cont] + matriz[i][j];

            }
            cont++;
        }
 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    prueba[cont] = prueba[cont] + matriz[i][j];

                }

            }

        }
        cont++;
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j > -1; j--) {
                if ((i + j) == 2) {
                    prueba[cont] = prueba[cont] + matriz[i][j];

                }
            }
        }
        cont++;
 
        for (int i = 0; i < 8; i++) {
            System.out.print(prueba[i] + " ");
        }
        
        int i=0;
        while ((prueba[0]==prueba[i]) && (i<8)){
            i++;
        }
        if (i==8){
            System.out.println("Es un cuadrado magico");
        } else {
            System.out.println("No es magico");
        }

        
        
    }
}
