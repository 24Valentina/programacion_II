package co.edu.uniquindio.libreria;

public abstract class Facturar implements IGenerarFactura {
    public int numero;
    public double total;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Facturar(int numero, double total) {
        this.numero = numero;
        this.total = total;
    }


    public abstract void GenerarFactura();


}

