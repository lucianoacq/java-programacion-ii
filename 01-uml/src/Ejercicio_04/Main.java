package Ejercicio_04;

public class Main {
    
    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args){
        
        Banco banco = new Banco("BNA", "ID-FISCAL-DEMO");
        Cliente cliente = new Cliente("Persona de ejemplo", "DNI-DEMO");

        
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("TARJETA-DEMO", "01-02-2030", banco, cliente);
        
        System.out.println(tarjeta);
        
        System.out.println("Tarjeta del cliente: " + cliente.getTarjetaDeCredito().getNumero());        
    } 
    
}