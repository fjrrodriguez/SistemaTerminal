package com.ramirez.julieth.terminaltransporte.repository.models;

import java.time.LocalTime;

public class Viaje {
private String destino;
private LocalTime hora_llegada;
private LocalTime hora_salida;
private String vs;

    public Viaje(String vs, String destino, LocalTime hora_llegada, LocalTime hora_salida) {
        this.destino = destino;
        this.hora_llegada = hora_llegada;
        this.hora_salida = hora_salida;
        this.vs = vs;
    }

    public String getVs() {
        return vs;
    }

    public void setVs(String vs) {
        this.vs = vs;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(LocalTime hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public LocalTime getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(LocalTime hora_salida) {
        this.hora_salida = hora_salida;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "destino='" + destino + '\'' +
                ", hora de salida=" + hora_salida +
                ", hora de llegada estimada al destino=" + hora_llegada +
                '}';
    }
}
