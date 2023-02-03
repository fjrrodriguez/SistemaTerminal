package com.ramirez.julieth.terminaltransporte.repository.models;

public class Bus {
    private int id;
    private String empresa;
    private int capacidad;
    private String bs;

    public Bus(String bs, int id, String empresa, int capacidad) {
        this.id = id;
        this.empresa = empresa;
        this.capacidad = capacidad;
        this.bs = bs;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", empresa='" + empresa + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
