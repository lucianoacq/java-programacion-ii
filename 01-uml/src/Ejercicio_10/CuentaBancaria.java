package Ejercicio_10;


public class CuentaBancaria {
    
    private String cbu;
    private String saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;
    
    public CuentaBancaria(String cbu, String saldo, String codigo, String ultimaModificacion, Titular titular){
        
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
        this.titular = titular;
        titular.setCuentaBancaria(this);
    }
    
    public String getCbu(){
        return cbu;
    }
    
    public String getSaldo(){
        return saldo;
    }
    
    public ClaveSeguridad getClaveSeguridad(){
        return claveSeguridad;
    }
    
    public Titular getTitular(){
        return titular;
    }
    
    @Override
    public String toString(){
        return "Cuenta bancaria [cbu=" + cbu + ", saldo=" + saldo + ", Clave seguridad=" + claveSeguridad + ", titular=" + titular.getNombre() + "]";
    }
    
}
