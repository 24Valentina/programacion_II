package co.edu.uniquindio.libreria;

public class EnvioFisico extends Envio {

   public String direccion;
   public String celular;

   public EnvioFisico(String nombreLibro, int cantidad, String nombreDestinatario, String direccion, String celular) {
      super(nombreLibro, cantidad, nombreDestinatario);
      this.direccion = direccion;
      this.celular = celular;
   }

   @Override
   public void MostrarDatosEnvio(){
      System.out.println("Los datos del envio fisico son: "+ "\n" +"Nombre Destinatario: "  + getNombreDestinatario() + "\n" +
              "Direccion: "   +   direccion);
   }

}
