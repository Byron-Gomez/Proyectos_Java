package org.byronxgomez.operadores;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {

        // creamos un objeto scaner para obtener los datos
        Scanner scanner = new Scanner(System.in);

        // obtenemos el alto
        System.out.println("Proporciona el Alto : ");
        int alto = Integer.parseInt(scanner.nextLine());

        // obtenenmos el área
        System.out.println("Proporciona el Ancho : ");
        int ancho = Integer.parseInt(scanner.nextLine());

        scanner.close();

        System.out.println("---------------------------------------------------------------");

        // se imprimen los datos
        System.out.println("Alto : " + alto);
        System.out.println("Ancho : " + ancho);

        // se calcula el area y se imprime
        System.out.println("area : "  + alto * ancho);
        // se calcula el perímetro y se calcula
        System.out.println("perimetro : " + (alto*ancho)/2);

    }
}
