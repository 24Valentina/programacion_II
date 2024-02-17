package co.edu.uniquindio.libreria;

public class ProcesadorPago {
    private IMedioPago MedioPago;

    public ProcesadorPago (IMedioPago MedioPago){
        this.MedioPago = MedioPago;
    }

    public void ProcesarPago (double total){
        MedioPago.GenerarPago(total);

    }

}
