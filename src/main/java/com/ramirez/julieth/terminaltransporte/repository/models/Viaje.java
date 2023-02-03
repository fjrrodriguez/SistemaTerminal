package com.ramirez.julieth.terminaltransporte.repository.models;

import java.util.List;

public class Viaje {
    private int idViaje;
    private Bus busOcupado;
    private Destino destinobus;
    private List<Pasajero> pasajerosABordo;

    public Viaje(String s, int idViaje, Bus busOcupado, List<Pasajero> pasajerosABordo, Destino destinobus) {
        this.idViaje = idViaje;
        this.busOcupado = busOcupado;
        this.pasajerosABordo = pasajerosABordo;
        this.destinobus = destinobus;
    }

    public Destino getDestinobus() {
        return destinobus;
    }

    public void setDestinobus(Destino destinobus) {
        this.destinobus = destinobus;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public Bus getBusOcupado() {
        return busOcupado;
    }

    public void setBusOcupado(Bus busOcupado) {
        this.busOcupado = busOcupado;
    }

    public List<Pasajero> getPasajerosABordo() {
        return pasajerosABordo;
    }

    public void setPasajerosABordo(List<Pasajero> pasajerosABordo) {
        this.pasajerosABordo = pasajerosABordo;
    }
}
