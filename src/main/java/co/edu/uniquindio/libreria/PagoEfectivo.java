package co.edu.uniquindio.libreria;

public class PagoEfectivo extends Pago.MedioPago {
    @Override
    public void GenerarPago(double total){
        System.out.println("Procesando pago por: $"+ total+ " en efectivo...");
    }

}
