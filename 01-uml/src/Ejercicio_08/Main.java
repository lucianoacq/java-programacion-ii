package Ejercicio_08;

public class Main {

    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Persona de ejemplo", "persona@example.com");

        Documento documento = new Documento("Contrato de alquiler", "Texto del contrato...", usuario, "FIRMA-DEMO", "2026-10-20");

        System.out.println(documento);
        System.out.println("Firmado por: " + documento.getFirmaDigital().getUsuario().getNombre());
    }

}