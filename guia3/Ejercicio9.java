/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Ejercicio9 {

    /**
     * Escriba un programa que lea 20 números. Si el número leído es igual a
     * cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero
     * cero". El programa deberá calcular y mostrar el resultado de la suma de
     * los números leídos, pero si el número es negativo no debe sumarse. Nota:
     * recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int num, cont, suma;
        cont = 0;
        suma = 0;
        while (cont < 5) {
            System.out.println("Ingrese un numero");

            num = leer.nextInt();
            if (num == 0) {
                System.out.println("Usted ingreso 0");
                break;
             }   
            if (num > 0) {
                    suma = suma + num;
                    cont++;
                } else {
                    System.out.println("Ingrese un numero positivo");
                    cont++;
                }
            }
        System.out.println("La suma es " + suma);

        }

    }
