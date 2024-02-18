package co.edu.uniquindio.libreria;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //imprimirFactura();
        //procesarPago();
        mostrarDatosEnvio("fisico");




    }
    private static void imprimirFactura() {
        Libro libro1 = new Libro("Cien años de soledad", "1998", "Gabriel Garcia Marquez", 20000);
        Factura factura = new Factura(libro1, 2, 0.1, 36000);
        FacturaImpresion facturaImpresion = new FacturaImpresion(factura);
        facturaImpresion.imprimirFactura();
    }
   private static void procesarPago(){

       ProcesadorPago Pago1= new ProcesadorPago(new PagoEfectivo());
       Pago1.ProcesarPago(10000);
       ProcesadorPago Pago2 = new ProcesadorPago(new PagoTarjeta());
       Pago2.ProcesarPago(20000);

   }
   private static void mostrarDatosEnvio(String tipoDeEnvio){



       switch (tipoDeEnvio) {
           case "envio":
               Envio envio = new Envio("Cien años de soledad",5,"Maria Mendez");
               envio.MostrarDatosEnvio();
               break;
           case "fisico":
               EnvioFisico envioFisico = new EnvioFisico("Blancanieves", 3, "Luis Reyes",
                       "Avenida norte 13","11263663");

               envioFisico.MostrarDatosEnvio();
               break;
               case "virtual":
               EnvioVirtual envioVirtual = new EnvioVirtual("Cenicienta",4,"Pablo Marin",
                       "Pablo@marin");
               envioVirtual.MostrarDatosEnvio();
               break;


           default:
               System.out.println("Opción no válida");
       }





   }
    }




