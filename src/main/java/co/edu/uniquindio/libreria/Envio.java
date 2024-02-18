package co.edu.uniquindio.libreria;

public  class Envio {
    String nombreLibro;
    int cantidad;
    String nombreDestinatario;

    public Envio(String nombreLibro, int cantidad, String nombreDestinatario) {
        this.nombreLibro = nombreLibro;
        this.cantidad = cantidad;
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public void MostrarDatosEnvio(){
        System.out.println("Los datos del envio son: "+ "\n" + "Nombre libro: " + getNombreLibro() + "\n" +
                "Cantidad :" + getCantidad() + "\n"
                + "Nombre Destinatario :" + getNombreDestinatario());
    }
}