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
public class Ejercicio03 {

    /**
     * Realizar un programa que solo permita introducir solo frases o palabras
     * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
     * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
     * Lenght() en Java.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int largo;
        String opc;
        String frase;
        do {
            System.out.println("Ingrese una palabra o Frase");

            frase = leer.next();

            largo = frase.length();

            if (largo == 8) {
                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO");
            }
            System.out.println("Desea continuar? S/N");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        
    }
}
