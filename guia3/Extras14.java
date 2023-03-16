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
public class Extras14 {

    /**Se dispone de un conjunto de N familias, cada una de las cuales tiene 
     * una M cantidad de hijos. Escriba un programa que pida la cantidad de 
     * familias y para cada familia la cantidad de hijos para averiguar la 
     * media de edad de los hijos de todas las familias.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Increse la cantidad de familias");
        
        int numFamilias=leer.nextInt();
        int sumaEdades=0;
        int cont=0;
        
        for (int i = 1; i < (numFamilias+1); i++) {
            System.out.println("Ingrese la cantidad de Hijos de la Familia " + i);
            int numHijos=leer.nextInt();
                for (int j = 1; j < (numHijos+1); j++) {
                    System.out.println("Ingrese la edad del Hijo " + j + " de la familia " + i);
                    int edad=leer.nextByte();
                    sumaEdades=sumaEdades+edad;
                    cont++;
            }
        }
        
        double media = (double)sumaEdades/(double)cont;
        
        
        System.out.println("La media de edades de los Chicos es de "+ String.format("%.2f", media));
    
    
    }
}
