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
public class Extras08 {

    /**
     * Escriba un programa que lea números enteros. Si el número es múltiplo de
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
     * cantidad de números pares y la cantidad de números impares. Al igual que
     * en el ejercicio anterior los números negativos no deben sumarse. Nota:
     * recordar el uso de la sentencia break.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;
        int leidos = 0;
        int suma = 0;

        do {
            System.out.println("Ingrese un numero entero");
            num = leer.nextInt();

            if (num >= 0) {
                suma = suma + num;
                leidos++;
                if (num % 2 != 0) {
                    impares++;
                } else {
                    pares++;
                }
            }
        } while (num % 5 != 0);

        System.out.println("Total Numeros Sumados: " + suma);
        System.out.println("Total numeros: " + leidos);
        System.out.println("Total Numeros Pares: " + pares);
        System.out.println("Total Numeros Impares: " + impares);

    }
}
