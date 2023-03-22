/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia05;

import java.util.Random;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 *
 *
 * @author dudum
 */
public class Extras04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int alumnos = 10;
        int alumnosA;
        double[][] notas = new double[5][10];

        llenarNotas(notas, alumnos);

        calcularPromedio(notas, alumnos);

        imprimirMatriz(notas, alumnos);

        alumnosA = aprobados(notas, alumnos);

        System.out.println("La cantidad de alumnos que aprobaron es de " + alumnosA);
        System.out.println("Los que no aprobaron son " + (alumnos - alumnosA));

    }

    public static void llenarNotas(double[][] notas, int alumnos) {

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < alumnos; j++) {
                switch (i) {
                    case 0:
                        notas[i][j] = ((double) random.nextInt(10) * .1);
                        break;
                    case 1:
                        notas[i][j] = ((double) random.nextInt(10) * .15);
                        break;
                    case 2:
                        notas[i][j] = ((double) random.nextInt(10) * .25);
                        break;
                    case 3:
                        notas[i][j] = ((double) random.nextInt(10) * .5);
                        break;
                }

            }
        }
    }

    public static void calcularPromedio(double[][] notas, int alumnos) {

        for (int j = 0; j < alumnos; j++) {
            for (int i = 0; i < 4; i++) {
                notas[4][j] = notas[4][j] + notas[i][j];
            }
        }

    }

    public static int aprobados(double[][] notas, int alumnos) {

        int apro = 0;

        for (int i = 0; i < alumnos; i++) {
            if (notas[4][i] >= 7) {
                apro++;
            }
        }

        return apro;
    }

    public static void imprimirMatriz(double[][] notas, int alumnos) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < alumnos; j++) {
                System.out.print(" " + String.format("%.2f", notas[i][j]) + " ");
            }
            System.out.println("");
        }
  
        
    }

}
