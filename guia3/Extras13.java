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
public class Extras13 {

    /**
     * Crear un programa que dibuje una escalera de números, donde cada línea de
     * números comience en uno y termine en el número de la línea. Solicitar la
     * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
     * número 3: 1 12 123
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de lineas");
        int num = leer.nextInt();
        int num2 = 1;

        for (int i = 2; i < (num + 2); i++) {
            System.out.println(num2);
            num2 = (num2 * 10) + i;

        }
    }
}
