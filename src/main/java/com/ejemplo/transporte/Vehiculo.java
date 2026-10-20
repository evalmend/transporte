package com.ejemplo.transporte;

public class Vehiculo {

    private String placa;
    private int capacidad;

    // El constructor usa el setter para que la capacidad se valide
    public Vehiculo(String placa, int capacidad) {
        this.placa = placa;
        setCapacidad(capacidad);
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // Solo asigna el valor si es mayor que 0; si no, lo ignora
    public void setCapacidad(int capacidad) {
        if (capacidad > 0) {
            this.capacidad = capacidad;
        }
    }

    // Tarifa base: 1500 por kilómetro
    public double calcularTarifa(double km) {
        return km * 1500;
    }

    public String descripcion() {
        return "Placa " + placa + ", capacidad " + capacidad;
    }
}
