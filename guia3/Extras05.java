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
public class Extras05 {

    /**Una obra social tiene tres clases de socios:
     * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
     *      descuento en todos los tipos de tratamientos.
     * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
     *      descuento para los mismos tratamientos que los socios del tipo A.
     * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
     *      sobre dichos tratamientos.
     * 
     * Solicite una letra (carácter) que representa la clase de un socio, 
     * y luego un valor real que represente el costo del tratamiento 
     * (previo al descuento) y determine el importe en efectivo a pagar 
     * por dicho socio.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);
        String plan;
        int importe;
        double total=0;
        do {
            System.out.println("Ingrese el tipo de Plan");
            plan=leer.next();
        } while ((!plan.equalsIgnoreCase("A")) && (!plan.equalsIgnoreCase("B")) && (!plan.equalsIgnoreCase("C")));
        
        System.out.println("Ingrese el importe del tratamiento");
            importe=leer.nextInt();
         
        switch (plan.toUpperCase()) {
            case "A":
                total=((double)importe*.5);
                break;
            case "B":
                total=((double)importe*.65);
                break;
            case "C":
                total=importe;
                break;
                
        }
        System.out.println("El importe a pagar es: " + total);
    }
}
