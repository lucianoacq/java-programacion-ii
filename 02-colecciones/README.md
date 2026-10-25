# Colecciones y relaciones entre objetos

Tres aplicaciones de consola que usan `ArrayList`, encapsulamiento, búsquedas y filtros.

| Ejercicio | Operaciones |
| --- | --- |
| Inventario | Alta, consulta por ID, listado, eliminación, actualización de stock, filtros por categoría y precio, total y mayor stock |
| Biblioteca | Alta de libros con autor, búsqueda y eliminación por ISBN, filtros por año y listado de autores |
| Universidad | Alta de profesores y cursos, asignación y cambio de profesor, eliminación y mantenimiento del vínculo en ambos sentidos |

## Ejecutar

Desde esta carpeta, con JDK 17 o superior:

```bash
mkdir out
javac --release 17 -encoding UTF-8 -d out @fuentes.txt
java -cp out tp6.colecciones.TP6Colecciones
```

Omitir `mkdir out` si la carpeta existe. Para ejecutar por separado:

```bash
java -cp out ejercicio1.Main
java -cp out ejercicio2.Main
java -cp out ejercicio3.Main
```

En NetBeans, abrir esta carpeta como proyecto y ejecutar con F6. La clase principal ejecuta los tres ejemplos en orden.

## Resultados de ejemplo

En el inventario se elimina P005 y se actualiza P001 a 50 unidades. El stock resultante es **115**. La biblioteca elimina LIB002 y termina con **4 libros**. En la universidad, al eliminar al profesor P003, su curso queda sin profesor asignado.

## Alcance

Los datos son de demostración y se mantienen en memoria. No se implementa una interfaz gráfica, persistencia ni una validación completa de precios, cantidades o identificadores duplicados. El vínculo profesor–curso se actualiza mediante `Curso.setProfesor` y los métodos de `Profesor`.
