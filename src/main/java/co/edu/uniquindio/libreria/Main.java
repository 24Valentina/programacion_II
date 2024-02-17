package co.edu.uniquindio.libreria;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "1998","Gabriel Garcia Marquez", 20000);
        Factura factura = new Factura(libro1,2,0.1,36000);
        FacturaImpresion facturaImpresion = new FacturaImpresion(factura);
        facturaImpresion.imprimirFactura();


        ProcesadorPago Pago1= new ProcesadorPago(new PagoEfectivo());
        Pago1.ProcesarPago(10000);

        ProcesadorPago Pago2 = new ProcesadorPago(new PagoTarjeta());
        Pago2.ProcesarPago(20000);





    }
}