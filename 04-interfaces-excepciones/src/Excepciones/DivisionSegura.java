package Excepciones;

import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingresá el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingresá el segundo número: ");
        int numero2 = scanner.nextInt();        
        
        try{
            if(numero2 == 0){
                throw new ArithmeticException("No se puede dividir por cero");
            } 
            
            double resultado = (double) numero1 / numero2;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
        }
        
    }
}