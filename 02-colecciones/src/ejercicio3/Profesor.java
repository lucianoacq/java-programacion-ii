package ejercicio3;

import java.util.ArrayList;

public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad){
        
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void agregarCurso(Curso c) {
        if(!cursos.contains(c)){
            cursos.add(c);  
        }
        
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso c) {
        cursos.remove(c);

        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }
    
    public void listarCursos() {
        for(Curso curso : cursos){
            System.out.println("Codigo: " + curso.getCodigo() + ", Nombre: " + curso.getNombre());
        }
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad + ", Cursos: " + cursos.size());
    }
    
}