# Herencia y polimorfismo

Cuatro demostraciones académicas de Java que se ejecutan desde `main.Main`.

| Ejercicio | Conceptos |
| --- | --- |
| Vehículos | Herencia de `Auto` desde `Vehiculo`, uso de `super` y sobrescritura |
| Figuras | Clase abstracta `Figura`; cálculo de áreas de círculo y rectángulo |
| Empleados | Sueldo de empleados de planta y temporales; `instanceof` y downcasting |
| Animales | Llamadas polimórficas a sonidos y descripciones mediante referencias de tipo `Animal` |

## Ejecutar

Desde esta carpeta, con JDK 17 o superior:

```bash
mkdir out
javac --release 17 -encoding UTF-8 -d out @fuentes.txt
java -cp out main.Main
```

Omitir `mkdir out` si la carpeta existe. En NetBeans, abrir esta carpeta y usar **Run Project**. La clase principal configurada es `main.Main`.

## Ejemplos de resultados

El rectángulo de lados 5 y 4 tiene área **20**. El empleado de planta con sueldo base 100000 y tres años de antigüedad recibe **115000**, según la fórmula académica del ejercicio. El temporal de 40 horas a 5000 recibe **200000**. Las fórmulas se usan como ejemplos de polimorfismo y no representan una liquidación laboral real.
