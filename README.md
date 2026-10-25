# Programación II en Java

Trabajos académicos de Luciano Acquaviva para la Tecnicatura en Programación de la Universidad Tecnológica Nacional. Reúnen ejemplos de relaciones entre objetos, colecciones, herencia, polimorfismo, interfaces y excepciones.

## Por dónde empezar

El módulo de **colecciones** contiene los proyectos más completos: un inventario, una biblioteca y una universidad con relación bidireccional entre profesores y cursos.

| Módulo | Contenido | Demostración principal |
| --- | --- | --- |
| [01 UML y relaciones](01-uml/) | 14 ejercicios con clases relacionadas y diagramas | `Ejercicio_01.Main` a `Ejercicio_14.Main` |
| [02 Colecciones](02-colecciones/) | Inventario, biblioteca y universidad con `ArrayList` | `tp6.colecciones.TP6Colecciones` |
| [03 Herencia y polimorfismo](03-herencia-polimorfismo/) | Vehículos, figuras, empleados y animales | `main.Main` |
| [04 Interfaces y excepciones](04-interfaces-excepciones/) | Pedidos y pagos simulados; ejercicios de manejo de errores | `tp8.TP8` y clases de `Excepciones` |

## Tecnologías

Java 17 o superior, biblioteca estándar y NetBeans como entorno de desarrollo. No se necesitan frameworks, servicios externos ni una base de datos.

## Ejecutar desde una terminal

Instalar un **JDK**, que incluye los comandos `java` y `javac`. Desde la raíz del repositorio:

```bash
cd 02-colecciones
mkdir out
javac --release 17 -encoding UTF-8 -d out @fuentes.txt
java -cp out tp6.colecciones.TP6Colecciones
```

Si `out` ya existe, omitir `mkdir out`. Los archivos `fuentes.txt` enumeran los archivos Java de cada módulo y permiten compilar en Windows, Linux y macOS sin depender de comodines de la terminal. Cada módulo se compila por separado.

## Ejecutar con NetBeans

Los módulos 02, 03 y 04 conservan sus archivos de proyecto. En **File > Open Project**, seleccionar la carpeta del módulo y usar **Clean and Build**. Las clases principales están configuradas para abrir las demostraciones, no los archivos vacíos del proyecto inicial.

Para el módulo 01, crear un proyecto Java e incorporar su carpeta `src`, o usar las instrucciones de terminal. Seleccionar el `Main` del ejercicio que se quiera ejecutar.

## Comprobaciones realizadas

- Compilación de los 100 archivos fuente de los cuatro módulos con JDK 17.
- Ejecución de los 14 ejemplos de UML.
- Ejecución de los tres ejemplos de colecciones, las cuatro demostraciones de polimorfismo y la simulación de pedidos.
- Pruebas de división normal y por cero, conversión inválida, edades dentro y fuera del rango y lectura de archivos existentes e inexistentes.

Para repetir las comprobaciones con Bash (Linux, macOS o Git Bash en Windows):

```bash
bash scripts/verificar.sh
```

## Alcance

Son ejercicios de consola con datos de demostración. Los proyectos de colecciones y pedidos mantienen los datos en memoria; los pagos solo imprimen mensajes y no procesan dinero real. Algunas validaciones se limitan al objetivo de cada consigna, como se explica en los README de los módulos.

## Preparación del repositorio

El código parte de los trabajos académicos entregados por el autor. Para publicarlos se organizaron los módulos, se excluyeron archivos compilados y configuraciones locales, se ajustó la compatibilidad a Java 17 y se conectaron las clases principales con las demostraciones. La documentación y esta preparación se realizaron con asistencia de ChatGPT.

[Perfil de GitHub](https://github.com/lucianoacq) · [LinkedIn](https://www.linkedin.com/in/luciano-acquaviva-0358732b2/)
