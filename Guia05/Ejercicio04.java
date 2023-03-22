/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;

/**Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz 
 * A se denota por B y se obtiene cambiando sus filas por columnas 
 * (o viceversa).

 *
 * @author dudum
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Random random = new Random();
    
     int[][] matrizA = new int[4][4];
     int[][] matrizB = new int[4][4];
     
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j]=random.nextInt(10);
                System.out.print("(" + matrizA[i][j] + ")");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j]=matrizA[j][i];
            }
        }
    
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("("+ matrizB[i][j]+")");
            }
            System.out.println("");
        }
    
        
        
        
        
        
    }
}
