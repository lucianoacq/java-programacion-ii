
package Interfaces;

public class MainInterfaces {

    public static void main(String[] args) {

        // ======================================
        // 1. CREAR CLIENTES
        // ======================================

        Cliente cliente1 = new Cliente("Juan");
        Cliente cliente2 = new Cliente("Ana");


        // ======================================
        // 2. CREAR PRODUCTOS
        // ======================================

        Producto producto1 = new Producto("Teclado", 15000);
        Producto producto2 = new Producto("Mouse", 8000);
        Producto producto3 = new Producto("Monitor", 120000);
        Producto producto4 = new Producto("Auriculares", 25000);


        // ======================================
        // 3. CREAR PEDIDOS
        // ======================================

        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);

        Pedido pedido2 = new Pedido(cliente2);
        pedido2.agregarProducto(producto3);
        pedido2.agregarProducto(producto4);


        // ======================================
        // 4. CALCULAR TOTALES
        // ======================================

        System.out.println("===== TOTALES DE PEDIDOS =====");

        System.out.println("Total pedido de Juan: $" + pedido1.calcularTotal());
        System.out.println("Total pedido de Ana: $" + pedido2.calcularTotal());


        // ======================================
        // 5. PROCESAR PAGO CON TARJETA
        // ======================================

        System.out.println("\n===== PAGO CON TARJETA =====");

        PagoConDescuento tarjeta = new PagoConTarjetaCredito();

        pedido1.cambiarEstado(EstadoPedido.EN_PROCESO);

        double totalTarjeta = tarjeta.aplicarDescuento(pedido1.calcularTotal());

        System.out.println("Total con descuento: $" + totalTarjeta);

        tarjeta.procesarPago(totalTarjeta);

        pedido1.cambiarEstado(EstadoPedido.PAGADO);


        // ======================================
        // 6. PROCESAR PAGO CON PAYPAL
        // ======================================

        System.out.println("\n===== PAGO CON PAYPAL =====");

        PagoConDescuento paypal = new PagoConPayPal();

        pedido2.cambiarEstado(EstadoPedido.EN_PROCESO);

        double totalPayPal = paypal.aplicarDescuento(pedido2.calcularTotal());

        System.out.println("Total con descuento: $" + totalPayPal);

        paypal.procesarPago(totalPayPal);

        pedido2.cambiarEstado(EstadoPedido.PAGADO);


        // ======================================
        // 7. FINALIZAR
        // ======================================

        System.out.println("\n===== FIN DE LA DEMOSTRACION =====");
    }
}
