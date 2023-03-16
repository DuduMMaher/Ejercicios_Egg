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
public class Extras07 {

    /**
     * Realice un programa que calcule y visualice el valor máximo, el valor
     * mínimo y el promedio de n números (n>0). El valor de n se solicitará al
     * principio del programa y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra
     * con el bucle “do - while”.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int max = 0;
        int min = 0;
        double prom;
        int cont = 1;
        int num = 0;
        int suma = 0;
        boolean ref1 = false;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cant de numeros a ingresar");

        int cant = leer.nextInt();

        do {
//        while (cont <= cant) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma = suma + num;

            if (num > max) {
                max = num;
            }
            if (!ref1) {
                min = num;
                ref1 = true;
            }
            if (num < min) {
                min = num;
            }
            cont++;
//        }

              } while (cont<=cant);
        prom = (double) suma / (double) cant;
        System.out.println("Total: " + suma);
        System.out.println("Promedio: " + prom);
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);

    }
}
