#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
for modulo in 01-uml 02-colecciones 03-herencia-polimorfismo 04-interfaces-excepciones; do
  (cd "$modulo"; mkdir -p out; javac --release 17 -encoding UTF-8 -d out @fuentes.txt)
done
for n in {1..14}; do
  printf -v numero '%02d' "$n"
  java -cp 01-uml/out "Ejercicio_${numero}.Main" >/dev/null
done
salida=$(java -cp 02-colecciones/out tp6.colecciones.TP6Colecciones)
[[ "$salida" == *'Unidades disponibles: 115'* ]]
[[ "$salida" == *'Libros disponibles: 4'* ]]
salida=$(java -cp 03-herencia-polimorfismo/out main.Main)
[[ "$salida" == *'115000.0'* && "$salida" == *'200000.0'* ]]
salida=$(java -cp 04-interfaces-excepciones/out tp8.TP8)
[[ "$salida" == *'20700.0'* && "$salida" == *'137750.0'* ]]
salida=$(printf '8\n2\n' | java -cp 04-interfaces-excepciones/out Excepciones.DivisionSegura)
[[ "$salida" == *'Resultado: 4.0'* ]]
salida=$(printf '8\n0\n' | java -cp 04-interfaces-excepciones/out Excepciones.DivisionSegura)
[[ "$salida" == *'No se puede dividir por cero'* ]]
salida=$(printf 'abc\n' | java -cp 04-interfaces-excepciones/out Excepciones.ConversionNumero)
[[ "$salida" == *'no es un número válido'* ]]
salida=$(printf '%s\n' '-1' | java -cp 04-interfaces-excepciones/out Excepciones.ValidacionEdad)
[[ "$salida" == *'Error:'* ]]
salida=$(printf '23\n' | java -cp 04-interfaces-excepciones/out Excepciones.ValidacionEdad)
[[ "$salida" == *'Edad válida: 23'* ]]
for clase in LecturaArchivo LecturaConRecursos; do
  salida=$(cd 04-interfaces-excepciones; printf 'ejemplo.txt\n' | java -cp out "Excepciones.$clase")
  [[ "$salida" == *'Segunda línea'* ]]
  salida=$(cd 04-interfaces-excepciones; printf 'archivo-inexistente.txt\n' | java -cp out "Excepciones.$clase")
  [[ "$salida" == *'Error'* ]]
done
echo 'Compilación y demostraciones verificadas correctamente.'
