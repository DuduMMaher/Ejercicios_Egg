/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Extras06 {

    /**
     * Leer la altura de N personas y determinar el promedio de estaturas que se
     * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double altura=0;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas");
        int cant = leer.nextInt();
        
        
        
        double totalA = 0;
        double totalB = 0;
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la estatura de la Persona Nro " + (i + 1));
            altura = leer.nextDouble();
            if (altura < 1.6) {
                totalB = totalB + altura;
                suma2++;
            }
            totalA = totalA + altura;
            suma1++;
        }
        double prom1 = totalA / (double)suma1;
        double prom2 = totalB / (double)suma2;
        
       
//        double aux = ((double) Math.round(prom1*100d)/100d);
        System.out.println("El promedio de Altura total es de " + String.format("%.2f", prom1));
        System.out.println("altura total " + String.format("%.2f", totalA));
        System.out.println("total personas " + suma1);
        System.out.println("El promedio de Altura menor a 1.60 es de " + prom2);
        
 
    
      
        
        
    }
}
