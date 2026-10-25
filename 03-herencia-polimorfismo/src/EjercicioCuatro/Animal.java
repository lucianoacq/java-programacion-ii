package EjercicioCuatro;

public class Animal {
    
    protected String nombre;
    
    public Animal(String nombre){
        
        this.nombre = nombre;
    }
    
    public void hacerSonido(){
        System.out.println("Sonido del animal: ");
    }
    
    public void describirAnimal(){
        System.out.println("Nombre: " + nombre);
    }
    
}
