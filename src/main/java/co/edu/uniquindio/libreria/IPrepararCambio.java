package co.edu.uniquindio.libreria;

abstract interface IPrepararCambio {
   public default void PrepararCambio(){
      System.out.println("Su cambio es");
   }
}
