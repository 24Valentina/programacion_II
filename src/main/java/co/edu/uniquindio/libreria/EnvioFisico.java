package co.edu.uniquindio.libreria;

public class EnvioFisico extends Envio {
    private String direccion;
    private String celular;

    private String nombreDestinatario;
    private String nombreLibro;
    public String mostrarDatosEnvio() {
        return "datos del envio:" +"\n"+
                "direccion del destinatario:"+direccion + "\n"+
                "celular:"+celular + "\n"+
                "nombre del libro" + nombreLibro +"\n"+
                "nombre del destinatario" + nombreDestinatario;
    }
}
