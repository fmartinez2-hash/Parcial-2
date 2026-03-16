# Parcial-2
// ...existing code...
# Parcial 2 - Gestión de Empleados

- Autor: (tu nombre)
- Versión: 1.0
- Descripción: Proyecto simple en Java para gestionar empleados (clases: `Empleado`, `Empleados`, `Cargos`, `Constantes`). Incluye tests JUnit 5 para validación de parámetros (análisis caja negra).

Estructura:
- Empleado.java: entidad con validaciones.
- Empleados.java: contenedor de ejemplo y operaciones en bloque.
- Cargos.java: cargos permitidos.
- Constantes.java: mensajes y valores de convenio.
- TESTING.md: análisis de caja negra (parámetros, casos válidos y no válidos).
- tests/: tests JUnit 5.

Cómo ejecutar tests (manual):
1. Descargar JUnit 5 jars (junit-jupiter-api, junit-jupiter-engine, apiguardian, opentest4j) y añadir al classpath.
2. Compilar clases y tests: javac -cp .;path\to\junit-jars\* tests\*.java *.java
3. Ejecutar con la JVM y el motor JUnit o usar un runner IDE que soporte JUnit 5.

Notas:
- Las pruebas comprueban creación válida e invalidaciones según los criterios definidos en TESTING.md.
- Si usas VSCode con Code Runner, activa "Run In Terminal" para permitir Scanner en main.
