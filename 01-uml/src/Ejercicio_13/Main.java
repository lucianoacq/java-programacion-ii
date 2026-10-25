package Ejercicio_13;

public class Main {

    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Persona de ejemplo", "persona@example.com");
        String valor = "QR-00123456";

        GeneradorQR generador = new GeneradorQR();
        generador.generar(valor, usuario);
    }
}