package co.edu.uniquindio.libreria;

public class EnvioVirtual extends Envio{
    private String email;
    private String nombreDestinatario;
    private String nombreLibro;

    public String mostrarDatosEnvio() {
        return "datos del envio:" +"\n"+
                "email destinatario:"+email + "\n"+
                "nombre del libro" + nombreLibro +"\n"+
                "nombre del destinatario" + nombreDestinatario;
    }
}
