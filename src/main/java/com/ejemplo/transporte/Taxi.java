package com.ejemplo.transporte;

public class Taxi extends Vehiculo {

    private String empresa;

    public Taxi(String placa, int capacidad, String empresa) {
        super(placa, capacidad);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    // Tarifa del padre más 4000 de banderazo
    @Override
    public double calcularTarifa(double km) {
        return super.calcularTarifa(km) + 4000;
    }

    @Override
    public String descripcion() {
        return "Taxi " + super.descripcion() + ", empresa " + empresa;
    }
}
