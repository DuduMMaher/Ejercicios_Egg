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
public class Ejercicio06 {

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y
     * muestre por pantalla el siguiente menú:El usuario deberá elegir una
     * opción y el programa deberá mostrar el resultado por pantalla y luego
     * volver al menú. El programa deberá ejecutarse hasta que se elija la
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
     * vez de salir del programa directamente, se debe mostrar el siguiente
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
     * contrario se vuelve a mostrar el menú.
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String salir="N";
        do {
            System.out.println("MENU");
            System.out.println("");
            System.out.println("1.- Suma");
            System.out.println("2.-Restar");
            System.out.println("3.-Multiplicar");
            System.out.println("4.-Dividir");
            System.out.println("5.-Salir");

            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Suma= " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta= " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicar= " + (num1 * num2));
                    break;
                case 4:
                    double res = ((double)num1/(double)num2);
                    System.out.println("Division= " + res);
                    break;
                case 5:
                    System.out.println("Realmente desea Salir? S/N");
                    salir=leer.next();
                    System.out.flush();
                    break;
            }

        } while (salir.equalsIgnoreCase("N"));
 
    }
}
