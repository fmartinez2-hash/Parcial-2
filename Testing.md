// ...existing code...
# TESTING - Análisis de Caja Negra

## Parámetros analizados
| Parámetro | Dominio | Restricción / criterio de aceptación |
|---|---:|---|
| nombre | String | No vacío, al menos dos palabras (nombre y apellido). Ver método [`Empleado.setNombre`](Empleado.java). |
| cargo | String | Debe pertenecer a la lista de cargos definidos en [`Cargos`](Cargos.java) (Desarrollador, Diseñadora, Gerente). Ver [`Cargos.esValido`](Cargos.java). |
| salario | double | No NaN, no negativo y >= [`Constantes.SALARIO_MINIMO_CONVENIO`](Constantes.java) (12000.0). Ver [`Empleado.setSalario`](Empleado.java). |

## Casos Válidos
| Caso | nombre | cargo | salario | Resultado esperado |
|---|---|---|---:|---|
| V1 | "Ana López" | "Desarrollador" | 15000.0 | Creación OK |
| V2 | "Juan Pérez" | "Diseñadora" | 12000.0 | Creación OK (igual convenio) |
| V3 | "María Ruiz" | "Gerente" | 50000.0 | Creación OK |

## Casos No Válidos
| Caso | nombre | cargo | salario | Resultado esperado |
|---|---|---|---:---|---|
| N1 | "" | "Desarrollador" | 15000.0 | Excepción por nombre inválido (vacío) |
| N2 | "Ana" | "Desarrollador" | 15000.0 | Excepción por nombre de una sola palabra |
| N3 | "Luis Gómez" | "CEO" | 20000.0 | Excepción por cargo no permitido |
| N4 | "Laura Díaz" | "Gerente" | -100.0 | Excepción por salario negativo |
| N5 | "Pedro Soto" | "Diseñadora" | 1000.0 | Excepción por salario por debajo de convenio |
// ...existing code...