package Ejercicio_03;


public class Main {
    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {

        Autor autor = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires, Argentina");


        Libro libro = new Libro("Cien años de soledad", "978-0307474728", autor, editorial);

        System.out.println(libro);


        System.out.println("Autor del libro: " + libro.getAutor().getNombre());
        System.out.println("Editorial del libro: " + libro.getEditorial().getNombre());

    }
}