package org.byronxgomez.operadores;

import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {

        // se crea un objeto scaner para obtener los datos
        Scanner scanner = new Scanner(System.in);

        // se pide el num1 y se captura
        System.out.println("Proporciona el numero 1 : ");
        int num1 = Integer.parseInt(scanner.nextLine());

        // se pide el num2 y se captura
        System.out.println("Proporciona el numero 2 : ");
        int num2 = Integer.parseInt(scanner.nextLine());

        // se crea un nuevo objeto numMayor y se hace un if else con operadores relacionales para ver que número es mayor
        int numMayor;
        if (num1 > num2){
            numMayor = num1;
        } else {
            numMayor = num2;
        }

        // se imprimen los resultados
        System.out.println("---------------------------------------------------------------");
        System.out.println(" El numero mayor es : " + numMayor);
        scanner.close();

    }
}
