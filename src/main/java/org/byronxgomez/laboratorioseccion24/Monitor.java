package org.byronxgomez.laboratorioseccion24;

public class Monitor extends DispositivoEntrada {
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;


    public Monitor(String tipoEntrada, String marca, double tamano) {
        super(tipoEntrada, marca);
        this.idMonitor = ++Monitor.contadorMonitores;
        this.tamano = tamano;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamano=" + tamano +
                '}';
    }
}
