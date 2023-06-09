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
public class Ejercicio07 {

    /**
     * Realizar un programa que simule el funcionamiento de un dispositivo
     * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
     * cadenas deben llegar con un formato fijo: tienen que ser de un máximo de
     * 5 caracteres de largo, el primer carácter tiene que ser X y el último
     * tiene que ser una O. Las secuencias leídas que respeten el formato se
     * consideran correctas, la secuencia especial “&&&&&” marca el final de los
     * envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete
     * el formato se considera incorrecta. Al finalizar el proceso, se imprime
     * un informe indicando la cantidad de lecturas correctas e incorrectas
     * recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan
     * las siguientes funciones de Java Substring(), Length(), equals().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String secuencia = "";
        do {

            System.out.println("Ingrese una cadena");

            secuencia = leer.nextLine();

            if (secuencia.length() < 6) {
                if ((secuencia.substring(0, 1).equals("X")) && (secuencia.substring(secuencia.length() - 1).equals("O"))) {
                    correctas++;
                } else {
                    if (!secuencia.equals("&&&&&")) {
                        incorrectas++;
                    }

                }
            } else {
                if (!secuencia.equals("&&&&&")) {
                    incorrectas++;
                }

            }

        } while (!secuencia.equals("&&&&&"));

        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);
    }
}
