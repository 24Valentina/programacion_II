package co.edu.uniquindio.libreria;
public class EnvioVirtual extends Envio{
    private String email;

    public EnvioVirtual(String nombreLibro, int cantidad, String nombreDestinatario, String email) {
        super(nombreLibro, cantidad, nombreDestinatario);
        this.email = email;
    }
    @Override
    public void MostrarDatosEnvio(){
        System.out.println("Los datos del envio virtual son: "+ "\n" + "email: "   +   email);
    }



}
