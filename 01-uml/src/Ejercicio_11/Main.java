package Ejercicio_11;

public class Main {

    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {
        Artista artista = new Artista("Charly Garcia", "Rock nacional");
        Cancion cancion = new Cancion("Demoliendo Hoteles", artista);

        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }

}