package Ejercicio_07;

public class Main {
    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {

        Motor motor = new Motor("V8 Biturbo", "MTR-998877");

        Conductor conductor = new Conductor("Persona de ejemplo", "DNI-DEMO");

        Vehiculo vehiculo = new Vehiculo("PATENTE-DEMO", "Mercedes-AMG", motor, conductor);

        System.out.println(vehiculo);
        System.out.println("Vehiculo de ejemplo: " + conductor.getVehiculo().getModelo());
    }    
}
