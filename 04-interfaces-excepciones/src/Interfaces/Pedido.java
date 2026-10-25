package Interfaces;

import java.util.ArrayList;

public class Pedido implements Pagable{

    private ArrayList<Producto> productos;
    private Cliente cliente;
    private EstadoPedido estado;
    
    public Pedido(Cliente cliente){
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = EstadoPedido.PENDIENTE;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambioDeEstado(estado);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }

        return total;
    }

}
