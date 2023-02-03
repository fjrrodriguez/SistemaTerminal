package com.ramirez.julieth.terminaltransporte.repository.models;

import java.time.LocalTime;

public class Destino {
private String destino;
private LocalTime hora_llegada;
private LocalTime hora_salida;
private String vs;
private int idDestino;

    public Destino(String vs, int idDestino,String destino, LocalTime hora_llegada, LocalTime hora_salida) {
        this.destino = destino;
        this.hora_llegada = hora_llegada;
        this.hora_salida = hora_salida;
        this.vs = vs;
        this.idDestino = idDestino;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
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


    public String toStringD() {
        return "Destino{" +
                "destino='" + destino + '\'' +
                ", hora de salida=" + hora_salida +
                ", hora de llegada estimada al destino=" + hora_llegada +
                '}';
    }
}
