package ejercicio2;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;
    
    public Biblioteca(String nombre){
        
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
    }

    public void listarLibros(){
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for(Libro libro : libros){
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        
        if (libro != null){
            libros.remove(libro);
        }
    }
 
    public int obtenerCantidadLibros() {
        int cantidad = libros.size();
        return cantidad;
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        
        ArrayList<Libro> resultado = new ArrayList<>();
        
        for(Libro libro : libros){
            if(libro.getAnioPublicacion() == anio){
                resultado.add(libro);
            }
        }
        
        return resultado;
    }
    
    public void mostrarAutoresDisponibles() {
        
        ArrayList<Autor> autoresMostrados = new ArrayList<>();
        
        for(Libro libro : libros){
            Autor autor = libro.getAutor();
            
            if(!autoresMostrados.contains(autor)){
                autoresMostrados.add(autor);
                autor.mostrarInfo();
            }
        }
    }
    
    
}