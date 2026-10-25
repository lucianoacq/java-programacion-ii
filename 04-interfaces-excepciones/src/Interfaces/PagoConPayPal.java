package Interfaces;

public class PagoConPayPal implements PagoConDescuento{
    
    @Override
    public void procesarPago(double monto){
        System.out.println("Pago con PayPal: $" + monto);
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.05);
    }
 
}