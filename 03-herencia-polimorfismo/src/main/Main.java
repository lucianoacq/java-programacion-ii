package main;

import java.util.ArrayList;
import EjercicioUno.Auto;
import EjercicioDos.Figura;
import EjercicioDos.Circulo;
import EjercicioDos.Rectangulo;
import EjercicioTres.Empleado;
import EjercicioTres.EmpleadoPlanta;
import EjercicioTres.EmpleadoTemporal;
import EjercicioCuatro.Animal;
import EjercicioCuatro.Perro;
import EjercicioCuatro.Gato;
import EjercicioCuatro.Vaca;

public class Main {

    public static void main(String[] args){
        
        //Ejercicio 1
        Auto auto1 = new Auto("BMW", "M3", 5);
        auto1.mostrarInfo();
        
        
        //Ejercicio 2
        Figura[] figuras = {
            new Circulo("Círculo", 3),
            new Rectangulo("Rectángulo", 5, 4)
        };
        
        for(Figura figura : figuras){
            System.out.println("Área: " + figura.calcularArea());
        }
        
        
        //Ejercicio 3
        Empleado[] empleados = {
            new EmpleadoPlanta(100000, 3),
            new EmpleadoTemporal(5000, 40)
        };
        
        for(Empleado empleado : empleados){
            System.out.println("Sueldo: " + empleado.calcularSueldo());
            
            if (empleado instanceof EmpleadoPlanta) {
                EmpleadoPlanta planta = (EmpleadoPlanta) empleado;
                System.out.println("Antigüedad: " + planta.getAntiguedad() + " años");
            }
        }
        
        
        //Ejercicio 4
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Rocky"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));
        
        for(Animal animal : animales){
           animal.describirAnimal();
           animal.hacerSonido(); 
        }

    }
}