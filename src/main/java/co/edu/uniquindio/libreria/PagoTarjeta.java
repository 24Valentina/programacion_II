package co.edu.uniquindio.libreria;

public class PagoTarjeta extends MedioPago {
    @Override
    public void GenerarPago (double total){
        System.out.println("Procesando pago por: $"+total + " con Tarjeta...");
    }


}
