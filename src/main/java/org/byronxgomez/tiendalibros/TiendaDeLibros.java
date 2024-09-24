package org.byronxgomez.tiendalibros;

import java.util.Scanner;

public class TiendaDeLibros {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el ID : ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Proporcionar Nombre : ");
        String nombre = scanner.nextLine();

        System.out.println("Proporcionar el Precio : ");
        double precio = Double.parseDouble(scanner.nextLine());

        System.out.println("Proporcionar el envio Gratuito (true / false) : ");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("---------------------------------------------------------------");
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);

        // cerramos el scaner
        scanner.close();
    }
}
