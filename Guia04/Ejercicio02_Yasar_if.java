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
public class Ejercicio02_Yasar_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     Scanner leer = new Scanner(System.in);
        int n, edad;
        String nombre, opcion;
        boolean mayor;
        do {

            System.out.println("Ingrese el nombre de la persona: ");
            nombre = leer.next();

            System.out.println("Ingrese la edad de " + nombre + ": ");
            edad = leer.nextInt();

            mayor = (edad >= 18);
            System.out.println(nombre + " tiene " + edad + " años y es " + (mayor ? "mayor" : "menor") + " de edad.");

            System.out.println("¿Desea ingresar más personas? (Sí/No)");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("No"));
    
    
    nombre=nombre.replace("a", "%");
        boolean par; //DEFINIMOS UNA VARIABLE BOOLEAN PARA EVALUAR LA CONDICION
        int num=0;

        par=(num%2==0);///La comparamos y devuelve True o False
        System.out.println(par? "Par":"Impar");
        // Al llamar a Par? con el signo de pregunta se fija si es true o false
        // Si es true nos muestra el primer valor, si es false el segundo valor.
       
        
        System.out.println(nombre);
    
    
    
    }
    
}
