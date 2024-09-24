package org.byronxgomez.laboratorioseccion24;

public class Teclado extends DispositivoEntrada {

    private static int contadorTeclados;
    private final int idTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                ", tipoEntrada='" + getTipoEntrada() + '\'' +
                ", marca='" + getMarca() + '\'' +
                '}';
    }
}
