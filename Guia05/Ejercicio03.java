/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;
import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 *
 * @author dudum
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese tamano del vector");

        int num = leer.nextInt();

        int vector[] = new int[num];
        int vectorAux[] = new int[num];
        int[] cant = new int[num];
        int[] digitos = new int[5];

        int cont = 0;

        for (int i = 0; i < num; i++) {
            vector[i] = random.nextInt(10000);

        }
        for (int i = 0; i < num; i++) {
            vectorAux[i] = vector[i];
            do {

                cont++;
                vectorAux[i] = (vectorAux[i] / 10);
            } while (vectorAux[i] / 10 != 0);

            cant[i] = cont + 1;
            digitos[cont]++;
            cont = 0;

        }
        for (int i = 0; i < num; i++) {
            System.out.print(cant[i] + " / ");
        }
        System.out.println("");
        for (int i = 0; i < num; i++) {

            System.out.print(vector[i] + " / ");

        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.println(digitos[i] + " tienen " + (i + 1) + " digitos");
        }

    }
}
