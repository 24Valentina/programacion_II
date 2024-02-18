package co.edu.uniquindio.libreria;

public class Factura {

    public Libro libro;
    public int cantidad;
    public double descuento;
    public double total;

    public Factura(Libro libro, int cantidad, double descuento, double total) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.total = total;
    }

}
