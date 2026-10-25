package Ejercicio_09;

public class Main {

    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Persona de ejemplo", "OSDE");
        Profesional profesional = new Profesional("Dra. Laura Torres", "Clinica Medica");

        CitaMedica cita = new CitaMedica("2026-10-22", "10:30", profesional, paciente);

        System.out.println(cita);
    }

}