# Transporte (Actividad Sesión 3 · Java con Spring Boot)

La empresa de transporte: herencia, polimorfismo y colecciones expuestos en una API REST.

## Contenido
- `Vehiculo.java`: clase base con atributos privados, setter que valida y tarifa base (km * 1500).
- `Bus.java` y `Taxi.java`: subclases con `extends`, `super` y `@Override`.
- `Practica.java`: Etapas 1, 2 y 3 en Java puro (herencia, `List` y `Map`).
- `TransporteController.java`: endpoints con la flota (`ArrayList`) y los conductores (`HashMap`).
- `TransporteApplication.java`: clase principal de Spring Boot.

## Cómo ejecutar
- Java puro: ejecutar el `main` de `Practica`.
- API: ejecutar `TransporteApplication` (o `mvn spring-boot:run`) y abrir `http://localhost:8080/vehiculos`.

## Endpoints
| Ruta | Respuesta |
|---|---|
| `/vehiculos` | Arreglo JSON con la flota (5 vehículos) |
| `/vehiculos/placa/{placa}` | Descripción del vehículo (sin distinguir mayúsculas) o "No se encontró el vehículo ..." |
| `/vehiculos/tarifa/{km}` | Lista de textos con descripción y tarifa |
| `/vehiculos/capacidad/{minima}` | Vehículos con capacidad mayor o igual a la mínima |
| `/conductor/{placa}` | Conductor de la placa o "Sin conductor asignado" |
| `/vehiculos/mayor-capacidad` | Vehículo con más capacidad (reto) |
| `/vehiculos/total-capacidad` | Suma de capacidades (reto extra) |
