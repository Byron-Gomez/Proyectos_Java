package org.byronxgomez.laboratorioseccion24;

public class Orden {

    private final int idOrden;
    private Computadora[] computadoras;
    private int contadorComputadoras;
    private static int contadorOrdenes;
    private final int maxComputadoras = 10;
    // Constructor
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < maxComputadoras) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha alcanzado el límite máximo de computadoras: " + maxComputadoras);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + this.idOrden);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
