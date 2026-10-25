package ejercicio3;

public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre){
        
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Profesor getProfesor(){
        return profesor;
    }
                
    public void setProfesor(Profesor p) {
        
        if (this.profesor == p) {
            return;
        }
        
        Profesor anterior = profesor;
        this.profesor = p;
        
        if (anterior != null) {
            anterior.eliminarCurso(this);
        }
        if (p != null) {
            p.agregarCurso(this);
        }
        
    }
    
    public void mostrarInfo() {
        if (profesor != null) {
            System.out.println("Codigo: " + codigo + ", Nombre: " + nombre + ", Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Codigo: " + codigo + ", Nombre: " + nombre + ", Profesor: Sin asignar");
        }
    }
    
}