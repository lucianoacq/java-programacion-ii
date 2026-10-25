package Interfaces;

public class PagoConTarjetaCredito implements PagoConDescuento{
    
    @Override
    public void procesarPago(double monto){
        System.out.println("Pago con tarjeta de credito: $" + monto);
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.10);
    }
    
}
