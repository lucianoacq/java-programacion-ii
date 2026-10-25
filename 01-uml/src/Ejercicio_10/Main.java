package Ejercicio_10;

public class Main {

    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {
        Titular titular = new Titular("Persona de ejemplo", "DNI-DEMO");

        CuentaBancaria cuenta = new CuentaBancaria("CBU-DEMO", "150000.50", "CLAVE-DEMO-NO-REAL", "2026-09-01", titular);

        System.out.println(cuenta);
        System.out.println("Cuenta de " + titular.getNombre() + ": " + titular.getCuentaBancaria().getCbu());
    }

}