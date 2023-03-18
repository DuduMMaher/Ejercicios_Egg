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
public class Ejercicio03 {

    /**
     * Crea una aplicación que a través de una función nos convierta una
     * cantidad de euros introducida por teclado a otra moneda, estas pueden ser
     * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad
     * de euros y la moneda a convertir que será una cadena, este no devolverá
     * ningún valor y mostrará un mensaje indicando el cambio (void). El cambio
     * de divisas es: 0.86 libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es
     * un 1 €
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el importe de Euros a convertir");

        int euros = leer.nextInt();
        int opc;
        do {

            System.out.println(" MENU");
            System.out.println("");
            System.out.println("1.- Libras");
            System.out.println("2.- Dolares");
            System.out.println("3.- Yenes");
            System.out.println("4.- Salir");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    calculo(euros, 0.86, "Libras");
                    break;
                case 2:
                    calculo(euros, 1.28611, "Dolares");
                    break;
                case 3:
                    calculo(euros, 129.852, "Yenes");
                    break;
            }
        } while (opc != 4);

    }

    public static void calculo(int a, double b, String c) {

        double cambio;

        cambio = a * b;

        System.out.println("El cambio de " + a + " Euros a " + c + " es de ");
        System.out.println(String.format("%.2f", cambio));

    }
}
