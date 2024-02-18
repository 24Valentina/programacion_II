package co.edu.uniquindio.libreria;

public class FacturaImpresion {
    private Factura factura;

    public FacturaImpresion(Factura factura) {
        this.factura = factura;
    }
    public void imprimirFactura(){

        System.out.println(factura.cantidad + " libros de: " + factura.libro.getNombre() + " = " + "$ " + factura.cantidad *factura.libro.getPrecio()+"\n"+
                " tiene un descuento del: " + factura.descuento + " total: " + factura.total  );
    }
}
