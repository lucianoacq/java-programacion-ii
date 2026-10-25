package Ejercicio_06;

public class Main {

    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Persona de ejemplo", "TELEFONO-DEMO");
        Mesa mesa = new Mesa("12", "4");

        Reserva reserva = new Reserva("2026-10-25", "21:00", cliente, mesa);

        System.out.println(reserva);
    }

}