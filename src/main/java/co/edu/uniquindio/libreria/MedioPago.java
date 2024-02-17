package co.edu.uniquindio.libreria;

public abstract class MedioPago implements IMedioPago{

    @Override
    public void GenerarPago(double total) {
        System.out.println("Procesando Pago ...");
    }

}
