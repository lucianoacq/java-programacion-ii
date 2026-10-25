package Excepciones;

import java.util.Scanner;

public class ValidacionEdad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá tu edad: ");
        int edad = scanner.nextInt();

        try{
            
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años");
            } 
            
            System.out.println("Edad válida: " + edad);
            
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}