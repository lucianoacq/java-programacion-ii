package Ejercicio_05;

public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    public Computadora(String marca, String numeroSerie, String modelo, String chipset, Propietario propietario){
        
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
        this.propietario = propietario;
        propietario.setComputadora(this);
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getNumeroSerie(){
        return numeroSerie;
    }
    
    public PlacaMadre getPlacaMadre(){
        return placaMadre;
    }
    
    public Propietario getPropietario(){
        return propietario;
    }
    
    @Override
    public String toString(){
        return "Computadora [marca=" + marca + ", numero de serie=" + numeroSerie + ", placa madre=" + placaMadre + ", propietario=" + propietario.getNombre() + "]";
    }
    
}
