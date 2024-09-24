package org.byronxgomez.tiendalibros;

import java.util.Scanner;

public class TiendaDeLibros {
    public static void main(String[] args) {

        // creamos un objeto de la clase scaner para leer lo que ingrese el usuario
        Scanner scanner = new Scanner(System.in);

        // se pide el ID y se captura
        System.out.println("Proporciona el ID : ");
        int id = Integer.parseInt(scanner.nextLine());  // Leemos la entrada como cadena y luego la convertimos a entero con Integer.parseInt()

        // se pide el nombre y se captura
        System.out.println("Proporcionar Nombre : ");
        String nombre = scanner.nextLine();  // Leemos el nombre del libro directamente como cadena de texto (String)

        // se pide el precio y se captura
        System.out.println("Proporcionar el Precio : ");
        double precio = Double.parseDouble(scanner.nextLine());  // Leemos la entrada como cadena y luego la convertimos a un número decimal (double)

        // se pide si es gratis o no el envio y se captura
        System.out.println("Proporcionar el envio Gratuito (true / false) : ");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());  // Leemos la entrada como cadena y la convertimos a booleano con Boolean.parseBoolean()

        // se imprimen los datos en formato que se pidio
        System.out.println("---------------------------------------------------------------");
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);

        // cerramos el scaner
        scanner.close();
    }
}
