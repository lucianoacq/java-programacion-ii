package ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        // 1. Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // 2. Crear 3 autores
        Autor dante = new Autor("A001", "Dante Alighieri", "Italiana");
        Autor george = new Autor("A002", "George Orwell", "Britanica");
        Autor gabriel = new Autor("A003", "Gabriel García Márquez", "Colombiana");
        
        // 3. Agregar 5 libros
        biblioteca.agregarLibro("LIB001", "La Divina Comedia", 1321, dante);
        biblioteca.agregarLibro("LIB002", "La vida nueva", 1294, dante);
        biblioteca.agregarLibro("LIB003", "1984", 1949, george);
        biblioteca.agregarLibro("LIB004", "Rebelión en la granja", 1945, george);
        biblioteca.agregarLibro("LIB005", "Cien años de soledad", 1967, gabriel);
        
        // 4. Listar todos los libros
        System.out.println("=== LISTA DE LIBROS ===");
        biblioteca.listarLibros();
        
        // 5. Buscar un libro por ISBN
        System.out.println("\n=== BUSCAR LIBRO POR ISBN ===");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("LIB001");       
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado");
        }        
        
        // 6. Filtrar libros por año
        System.out.println("\n=== LIBROS POR AÑO ===");
        ArrayList<Libro> librosFiltrados = biblioteca.filtrarLibrosPorAnio(1949);

        for (Libro libro : librosFiltrados) {
            libro.mostrarInfo();
        }        
        
        // 7. Eliminar un libro
        System.out.println("\n=== ELIMINAR LIBRO LIB002 ===");
        biblioteca.eliminarLibro("LIB002");
        biblioteca.listarLibros();
        
        // 8. Mostrar el total de libros
        System.out.println("\n=== TOTAL DE LIBROS ===");
        System.out.println("Libros disponibles: " + biblioteca.obtenerCantidadLibros());
        
        // 9. Mostrar autores disponibles
        System.out.println("\n=== AUTORES DISPONIBLES ===");
        biblioteca.mostrarAutoresDisponibles();        
        
        // 10. Buscar un libro inexistente
        System.out.println("\n=== BUSCAR LIBRO INEXISTENTE ===");

        Libro libroInexistente = biblioteca.buscarLibroPorIsbn("LIB999");

        if (libroInexistente != null) {
            libroInexistente.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado");
        }        
    }
}