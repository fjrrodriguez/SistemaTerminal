package com.ramirez.julieth.terminaltransporte.repository.models;

public class Pasajero {
    private int cedula;
    private String nombre;
    private String ps;

    public Pasajero(String ps, int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.ps = ps;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
