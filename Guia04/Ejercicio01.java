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
public class Ejercicio01 {

    /**
     * Crea una aplicación que le pida dos números al usuario y este pueda
     * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
     * tener una función para cada operación matemática y deben devolver sus
     * resultados para imprimirlos en el main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos Numeros");

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        int opc;
        
        do {
             System.out.println("");
        System.out.println("MENU");
        System.out.println("1.-Sumar");
        System.out.println("2.-Restar");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Dividir");
        System.out.println("5.-Salir");

        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                int suma= sumar(num1, num2);
                System.out.println(suma);
                break;
            case 2:
                int resta= restar(num1, num2);
                System.out.println(resta);
                break;
            case 3:
                int mult= multipicar(num1, num2);
                System.out.println(mult);
                break;
            case 4:
                double divi= dividir(num1, num2);
                System.out.println(String.format("%.2f", divi));
                break;
                
        }
        } while (opc!=5);
      
    }

    public static int sumar(int a, int b){
        
        return (a+b);
        
    }
    public static int restar(int a, int b){
        
        return (a-b);
        
    }
    public static int multipicar(int a, int b){
        
        return (a*b);
        
    }
    public static double dividir(double a, double b){
        
        return (a/b);
        
    }
}
