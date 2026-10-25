# UML y relaciones entre objetos

Catorce ejercicios académicos de Java con diagramas e implementaciones de asociaciones, agregación, composición y dependencias entre clases.

## Compilar y ejecutar

Desde esta carpeta, con JDK 17 o superior:

```bash
mkdir out
javac --release 17 -encoding UTF-8 -d out @fuentes.txt
java -cp out Ejercicio_01.Main
```

Omitir `mkdir out` si la carpeta existe. Cambiar `01` por el número del ejercicio, hasta `14`. Cada paquete tiene su propio `Main`; se compilan juntos porque los paquetes mantienen separadas las clases del mismo nombre.

## Ejercicios y diagramas

| Ejercicio | Modelo | Diagrama |
| --- | --- | --- |
| 01 | Pasaporte, titular y foto | [Ver diagrama](diagramas/ejercicio1.png) |
| 02 | Celular, usuario y batería | [Ver diagrama](diagramas/ejercicio2.png) |
| 03 | Libro, autor y editorial | [Ver diagrama](diagramas/ejercicio3.png) |
| 04 | Tarjeta de crédito, cliente y banco | [Ver diagrama](diagramas/ejercicio4.png) |
| 05 | Computadora, propietario y placa madre | [Ver diagrama](diagramas/ejercicio5.png) |
| 06 | Reserva, cliente y mesa | [Ver diagrama](diagramas/ejercicio6.png) |
| 07 | Vehículo, conductor y motor | [Ver diagrama](diagramas/ejercicio7.png) |
| 08 | Documento, firma digital y usuario | [Ver diagrama](diagramas/ejercicio8.png) |
| 09 | Cita médica, paciente y profesional | [Ver diagrama](diagramas/ejercicio9.png) |
| 10 | Cuenta bancaria, titular y clave de seguridad | [Ver diagrama](diagramas/ejercicio10.png) |
| 11 | Reproductor, canción y artista | [Ver diagrama](diagramas/ejercicio11.png) |
| 12 | Calculadora, impuesto y contribuyente | [Ver diagrama](diagramas/ejercicio12.png) |
| 13 | Generador de QR, usuario y código | [Ver diagrama](diagramas/ejercicio13.png) |
| 14 | Editor de video, proyecto y render | [Ver diagrama](diagramas/ejercicio14.png) |

Los datos de los ejemplos son demostrativos. Las clases que modelan QR, firmas o renders ilustran relaciones entre objetos; no son implementaciones de generación real de QR, firma criptográfica ni procesamiento de video.

Los ejemplos usan identificadores textuales como `DNI-DEMO`, `CBU-DEMO` y `TARJETA-DEMO`, y correos del dominio reservado `example.com`. No representan documentos, cuentas, medios de pago ni credenciales reales.
