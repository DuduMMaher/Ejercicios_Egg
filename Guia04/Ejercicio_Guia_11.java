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
public class Ejercicio_Guia_11 {

    /**
     * Escribir un programa que procese una secuencia de caracteres ingresada
     * por teclado y terminada en punto, y luego codifique la palabra o frase
     * ingresada de la siguiente manera: cada vocal se reemplaza por el carácter
     * que se indica en la tabla y el resto de los caracteres (incluyendo a las
     * vocales acentuadas) se mantienen sin cambios. a e i o u
     *
     * @ # $ % *
     *
     * Realice un subprograma que reciba una secuencia de caracteres y retorne
     * la codificación correspondiente. Utilice la estructura “según” para la
     * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos
     * a las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s
     * @ l@s %nc# y 10.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");

        String frase = leer.nextLine();

        int largo = frase.length();
        String letra = "";
        String letra2 = "";

        for (int i = 0; i < largo; i++) {
            letra = frase.substring(i, (i + 1));
            letra2 = letra.toUpperCase();

            letra = vocales(letra2, letra);

            System.out.print(letra);
        }
        System.out.println("");

    }

    public static String vocales(String letra2, String letra) {

        switch (letra2) {
            case "A":
                letra = "@";
                break;
            case "E":
                letra = "#";
                break;
            case "I":
                letra = "$";
                break;
            case "O":
                letra = "%";
                break;
            case "U":
                letra = "*";
                break;
            default:

        }
        return letra;
    
}
}
