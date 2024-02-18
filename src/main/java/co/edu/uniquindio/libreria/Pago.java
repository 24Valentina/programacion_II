package co.edu.uniquindio.libreria;

public class Pago {

    public abstract static class MedioPago implements IMedioPago {

        @Override
        public void GenerarPago(double total) {
            System.out.println("Procesando Pago ...");
        }

    }
}
