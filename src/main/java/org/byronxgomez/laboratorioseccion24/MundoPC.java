package org.byronxgomez.laboratorioseccion24;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("HDMI", "Samsung", 27.0);
        Teclado teclado1 = new Teclado("U SB", "Logitech");
        Raton raton1 = new Raton("Inalámbrico", "Logitech");

        Computadora computadora1 = new Computadora("PC Gamer", monitor1, teclado1, raton1);

        Monitor monitor2 = new Monitor("VGA", "Dell", 24.0);
        Teclado teclado2 = new Teclado("Bluetooth", "HP");
        Raton raton2 = new Raton("USB", "HP");

        Computadora computadora2 = new Computadora("PC Oficina", monitor2, teclado2, raton2);

        Computadora computadora3 = new Computadora("PC Basica", monitor1, teclado2, raton1);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora3);


        orden1.mostrarOrden();
        orden2.mostrarOrden();

    }
}