package co.edu.uniquindio.libreria;


public class FacturaPagoEfectivo extends Facturar implements IPrepararCambio {
    public Facturar Factura;

    public FacturaPagoEfectivo(int numero, double total) {
        super(numero, total);
    }


    @Override
    public void GenerarFactura() {
        System.out.println("Se generó Factura No. "+numero+" por un total de: $"+total);
    }

    @Override
    public void PrepararCambio() {
        System.out.println("Sus cambios son");
    }


}
