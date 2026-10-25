package ejercicio3;

import java.util.ArrayList;

public class Universidad {
    
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
    public Universidad(String nombre){
        
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for(Profesor profesor : profesores){
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
        }

    public Curso buscarCursoPorCodigo(String codigo) {
    for(Curso curso : cursos){
        if (curso.getCodigo().equals(codigo)){
            return curso;
        }
    }
    return null;
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }
    
    public void listarProfesores(){
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }        
    }
    
    public void listarCursos(){
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }        
    }
    
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        
        if (curso != null){
            curso.setProfesor(null);
            cursos.remove(curso);
        }
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        
        if (profesor != null){
            for (Curso curso : cursos){
                if (curso.getProfesor() == profesor) {
                    curso.setProfesor(null);
                }
            }
            profesores.remove(profesor);
        }
    }
}