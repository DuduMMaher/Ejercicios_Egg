/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia04;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Ejercicio_Guia_12 {

    /**
     * Crea un procedimiento EsMultiplo que reciba los dos números pasados por
     * el usuario, validando que el primer número múltiplo del segundo e imprima
     * si el primer número es múltiplo del segundo, sino informe que no lo son.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numero");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        boolean multiplo = esMultiplo(num1, num2);

        if (multiplo) {
            System.out.println("Si es multiplo");
        } else {
            System.out.println("No es multiplo");
        }

    }

    public static boolean esMultiplo(int a, int b) {

        boolean multiplo = false;

        if (a % b == 0) {
            multiplo = true;
        }
        return multiplo;

    }
}
