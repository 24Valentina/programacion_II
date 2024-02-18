package co.edu.uniquindio.libreria;

import co.edu.uniquindio.libreria.IGenerarVoucher;

;

public class FacturaPagoTarjeta extends Facturar implements IGenerarVoucher {
    public FacturaPagoTarjeta(int numero, double total) {
        super(numero,total);

    }

    @Override
    public void GenerarFactura() {
        System.out.println("Se generó Factura No. "+numero+" por un total de: $"+total);
    }

    @Override
    public void GenerarVoucher() {
        System.out.println("Se genero el voucher del datafono");
    }
}
