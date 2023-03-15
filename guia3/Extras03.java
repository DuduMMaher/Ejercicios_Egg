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
public class Extras03 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
     * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
     * la función equals() de la clase String.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una Letra");
        String letra = leer.next();

        if ((letra.equalsIgnoreCase("A")) || (letra.equalsIgnoreCase("E")) || (letra.equalsIgnoreCase("I")) || (letra.equalsIgnoreCase("O")) || (letra.equalsIgnoreCase("U"))) {
            System.out.println("La letra " + letra.toUpperCase() + " es VOCAL");
        } else {
            System.out.println("La letra " + letra.toUpperCase() + " es CONSONANTE");
        }

    }
}
