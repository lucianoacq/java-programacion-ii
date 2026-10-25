# Interfaces y manejo de excepciones

Ejemplos académicos en Java divididos en dos paquetes.

## Interfaces

Simulación de productos, pedidos, clientes y pagos. Usa las interfaces `Pagable`, `Notificable`, `Pago` y `PagoConDescuento`, junto con `EstadoPedido`.

El pedido de Juan suma **23000**; con el descuento de tarjeta del ejemplo queda en **20700**. El de Ana suma **145000**; con el descuento de PayPal queda en **137750**. Los pagos y las notificaciones son mensajes en consola: no hay integración real con tarjetas ni PayPal.

## Compilar y ejecutar

Desde esta carpeta, con JDK 17 o superior:

```bash
mkdir out
javac --release 17 -encoding UTF-8 -d out @fuentes.txt
java -cp out tp8.TP8
```

Omitir `mkdir out` si ya existe. En NetBeans, **Run Project** inicia la demostración de interfaces. También se puede ejecutar directamente `Interfaces.MainInterfaces`.

## Excepciones

Cada ejercicio tiene su propio `main` y solicita datos por consola:

| Clase | Ejemplo que demuestra |
| --- | --- |
| `Excepciones.DivisionSegura` | División y captura de `ArithmeticException` cuando el divisor es cero |
| `Excepciones.ConversionNumero` | Conversión con `Integer.parseInt` y captura de `NumberFormatException` |
| `Excepciones.ValidacionEdad` | Excepción propia `EdadInvalidaException` para edades fuera de 0 a 120 |
| `Excepciones.LecturaArchivo` | Lectura de texto y captura de errores de archivo y de entrada/salida |
| `Excepciones.LecturaConRecursos` | Lectura con `try-with-resources` y cierre automático del lector |

```bash
java -cp out Excepciones.DivisionSegura
java -cp out Excepciones.ConversionNumero
java -cp out Excepciones.ValidacionEdad
java -cp out Excepciones.LecturaArchivo
java -cp out Excepciones.LecturaConRecursos
```

Para probar la lectura, ingresar `ejemplo.txt` cuando se solicite el archivo. También se puede ingresar un nombre inexistente para observar el manejo del error.

## Alcance

La división y la validación de edad esperan entradas enteras. El ingreso de texto en esos campos puede producir `InputMismatchException`, que no está cubierto por esas consignas. En `LecturaArchivo`, el cierre manual ocurre en el camino de lectura correcta; el ejercicio `LecturaConRecursos` muestra la alternativa con cierre automático incluso ante errores.
