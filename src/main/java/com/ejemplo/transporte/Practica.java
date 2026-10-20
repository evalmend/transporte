package com.ejemplo.transporte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practica {

    public static void main(String[] args) {

        // ===== ETAPA 1: clase Vehiculo =====
        System.out.println("=== ETAPA 1 ===");
        Vehiculo base = new Vehiculo("VEH301", 8);
        System.out.println(base.descripcion());

        base.setCapacidad(-5);
        System.out.println("Capacidad después de setCapacidad(-5): " + base.getCapacidad());

        base.setCapacidad(10);
        System.out.println("Capacidad después de setCapacidad(10): " + base.getCapacidad());
        System.out.println("calcularTarifa(10) del vehículo base: " + base.calcularTarifa(10));

        // ===== ETAPA 2: herencia y polimorfismo =====
        System.out.println();
        System.out.println("=== ETAPA 2 ===");
        Vehiculo bus = new Bus("BUS101", 40, "Centro-Norte");
        Vehiculo taxi = new Taxi("TAX201", 4, "Taxis Bogotá");

        System.out.println(base.descripcion() + " -> " + base.calcularTarifa(10));
        System.out.println(bus.descripcion() + " -> " + bus.calcularTarifa(10));
        System.out.println(taxi.descripcion() + " -> " + taxi.calcularTarifa(10));

        // ===== ETAPA 3: colecciones =====
        System.out.println();
        System.out.println("=== ETAPA 3 ===");
        List<Vehiculo> flota = new ArrayList<>();
        flota.add(new Bus("BUS101", 40, "Centro-Norte"));
        flota.add(new Bus("BUS102", 35, "Sur-Occidente"));
        flota.add(new Taxi("TAX201", 4, "Taxis Bogotá"));
        flota.add(new Taxi("TAX202", 4, "Taxis Capital"));
        flota.add(new Vehiculo("VEH301", 8));
        System.out.println("Tamaño de la flota: " + flota.size());

        for (Vehiculo v : flota) {
            System.out.println(v.descripcion() + " -> tarifa 10 km: " + v.calcularTarifa(10));
        }

        int contador = 0;
        for (Vehiculo v : flota) {
            if (v.getCapacidad() > 10) {
                contador++;
            }
        }
        System.out.println("Vehículos con capacidad mayor a 10: " + contador);

        Map<String, String> conductores = new HashMap<>();
        conductores.put("BUS101", "Carlos");
        conductores.put("TAX201", "Marta");
        conductores.put("VEH301", "Andrés");

        System.out.println("El conductor de BUS101 es " + conductores.get("BUS101"));
        if (conductores.containsKey("XYZ999")) {
            System.out.println("El conductor de XYZ999 es " + conductores.get("XYZ999"));
        } else {
            System.out.println("La placa XYZ999 no tiene conductor asignado");
        }
    }
}
