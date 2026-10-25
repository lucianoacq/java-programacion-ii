package Excepciones;

import java.util.Scanner;

public class ConversionNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá un número: ");
        String texto = scanner.nextLine();

        try{
            int numero = Integer.parseInt(texto);
            System.out.println("Numero: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número válido.");
        }
        
        
    }
}