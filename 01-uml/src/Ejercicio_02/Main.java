package Ejercicio_02;

public class Main {
    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {

        Bateria bateria = new Bateria("Li-Ion 4000", 4000);


        Usuario usuario = new Usuario("Persona de ejemplo", "DNI-DEMO");


        Celular celular = new Celular("IMEI-DEMO-1", "Samsung", "Galaxy A54", bateria, usuario);

        System.out.println(celular);
        System.out.println("Celular de ejemplo: " + usuario.getCelular().getModelo());


        Celular otroCelular = new Celular("IMEI-DEMO-2", "Motorola", "Moto G", bateria, new Usuario("Pedro", "DNI-DEMO-2"));
        System.out.println(otroCelular);
    }
}