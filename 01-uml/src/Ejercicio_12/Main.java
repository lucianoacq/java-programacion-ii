package Ejercicio_12;

public class Main {
    
    // Los identificadores de este ejemplo son ficticios y no son válidos.
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Persona de ejemplo", "ID-FISCAL-DEMO");
        Impuesto impuesto = new Impuesto(1500.50, contribuyente);

        Calculadora calculadora = new Calculadora();

        calculadora.calcular(impuesto);
    }    
     
}
