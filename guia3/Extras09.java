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
public class Extras09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int res = 0;
        int cont=0;
        
        if (num1 > num2) {
            res = num1;
            do {
                res = res - num2;
                cont++;
            } while (num2<res);
            System.out.println("El residuo es: " + res);
            System.out.println("El cociente es: " + cont);

        } else {
            System.out.println("El num2 es mayor al num1");
        }

    }
}
