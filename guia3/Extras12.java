/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/**
 *
 * @author dudum
 */
public class Extras12 {

    /**
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
     * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
     * aparezca un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E
     * 0-0-4 0-1-2 0-1-E Nota: investigar función equals() y como convertir
     * números a String.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String i1;
        String j1;
        String k1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    i1 = Integer.toString(i);
                    j1 = Integer.toString(j);
                    k1 = Integer.toString(k);
                    if (i1.equals("3")) {
                        i1 = "E";
                    }
                    if (j1.equals("3")) {
                        j1 = "E";
                    }
                    if (k1.equals("3")) {
                        k1 = "E";
                    }
                    System.out.println(i1 + "-" + j1 + "-" + k1);
                }

            }
        }
    }

}