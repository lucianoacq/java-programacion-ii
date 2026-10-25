package Ejercicio_05;


public class Main {

    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args){
        String modelo = "ASUS ROG STRIX B650E";
        String chipset = "AMD B650";

        Propietario propietario = new Propietario("Persona de ejemplo", "DNI-DEMO");

        Computadora computadora = new Computadora("Dell", "SN-884521", modelo, chipset, propietario);

        System.out.println(computadora);
        System.out.println("La compu de " + propietario.getNombre() + " es marca " + propietario.getComputadora().getMarca());
    }

}
