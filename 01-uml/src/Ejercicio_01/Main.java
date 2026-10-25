package Ejercicio_01;

public class Main {
    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {

        Titular luciano = new Titular("Persona de ejemplo", "DNI-DEMO");

        System.out.println("Titular recien creado:");
        System.out.println(luciano);
        System.out.println("Pasaporte de ejemplo: " + luciano.getPasaporte());

        System.out.println();


        Pasaporte pasaporte = new Pasaporte("PASAPORTE-DEMO", "2024-01-15", "foto_demo.jpg", "JPG", luciano);

        System.out.println("Pasaporte creado:");
        System.out.println(pasaporte);

        System.out.println();


        System.out.println("Ahora el pasaporte de ejemplo es: " + luciano.getPasaporte().getNumero());
        System.out.println("El titular del pasaporte es: " + pasaporte.getTitular().getNombre());
    }
}