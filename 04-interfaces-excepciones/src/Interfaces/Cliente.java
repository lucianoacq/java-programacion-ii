package Interfaces;

public class Cliente implements Notificable{

    private String nombre;
    
    public Cliente(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void notificarCambioDeEstado(EstadoPedido estado) {
        System.out.println("Cliente: " + nombre + " | Estado del pedido: " + estado);
    }
    
}
