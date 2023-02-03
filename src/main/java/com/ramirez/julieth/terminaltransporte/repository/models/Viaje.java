package com.ramirez.julieth.terminaltransporte.repository.models;

import java.util.List;

public class Viaje {
    private int idDestino;
    private List<Bus> busOcupado;
    private List<Destino> miDestino;

    public Viaje(int idDestino, List<Bus> busOcupado, List<Destino> miDestino) {
        this.idDestino = idDestino;
        this.busOcupado = busOcupado;
        this.miDestino = miDestino;

    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public List<Bus> getBusOcupado() {
        return busOcupado;
    }

    public void setBusOcupado(List<Bus> busOcupado) {
        this.busOcupado = busOcupado;
    }

    public List<Destino> getMiDestino() {
        return miDestino;
    }

    public void setMiDestino(List<Destino> miDestino) {
        this.miDestino = miDestino;
    }
}
