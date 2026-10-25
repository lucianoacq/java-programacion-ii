package Excepciones;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaConRecursos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();
        
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            
            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
    }
}