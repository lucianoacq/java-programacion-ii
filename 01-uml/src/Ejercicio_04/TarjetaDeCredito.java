package Ejercicio_04;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;
    
    public TarjetaDeCredito (String numero, String fechaVencimiento, Banco banco, Cliente cliente){
        
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
        cliente.setTarjetaDeCredito(this);
    }
    
    public String getNumero(){
        return numero;
    }

    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    
    public Banco getBanco(){
        return banco;
    }

    public Cliente getCliente(){
        return cliente;
    }    
    
    @Override
    public String toString() {
        return "Tarjeta de Credito [numero=" + numero + ", fecha de vencimiento=" + fechaVencimiento + ", banco=" + banco + ", cliente=" + cliente + "]";
    }   
}