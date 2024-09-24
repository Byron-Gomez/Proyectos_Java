package org.byronxgomez.laboratoriocaja;

public class Caja {
    private int ancho;
    private int alto;
    private int profundo;

    // constructor vacio
    public Caja() {
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen (int ancho, int alto, int profundo){
            // Fórmula para encontrar el volumen de una caja
        int volumen = (ancho * alto * profundo);
            // de una sola ves imprimir el resultado
            System.out.println("El Volumen de la caja es : " + volumen);
            // devuelve el resultado
        return volumen;
    }
}

