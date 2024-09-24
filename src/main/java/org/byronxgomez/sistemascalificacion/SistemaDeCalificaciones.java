package org.byronxgomez.sistemascalificacion;

import java.util.Scanner;

public class SistemaDeCalificaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la Calificacion entre el 0 al 10");
        double calificacion = scanner.nextDouble();

        if (calificacion >= 9 && calificacion <= 10 ){
            System.out.println("A");
        }
         else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        }
        else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        }
        else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        }
        else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("E");
        }
        else {
            System.out.println("Valor Desconocido");
        }

        scanner.close();
    }
}
