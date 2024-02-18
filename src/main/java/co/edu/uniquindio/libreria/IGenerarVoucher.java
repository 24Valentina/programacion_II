package co.edu.uniquindio.libreria;

abstract interface IGenerarVoucher {
    public default void GenerarVoucher(){
        System.out.println("Se ha generado su voucher");
    }
}
