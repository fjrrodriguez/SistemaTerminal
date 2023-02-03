package com.ramirez.julieth.terminaltransporte.repository;

import com.ramirez.julieth.terminaltransporte.repository.models.Bus;
import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;
import com.ramirez.julieth.terminaltransporte.repository.models.Viaje;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Repository
public class TerminalCentro {
    private String bs;
    private int idBus;
    private String nombreEmpresa;
    private int capacidadBus;
    private String vs;
    private String destinoViaje;
    private int horaSalida;
    private int minutoSalida;
    private int horaLlegada;
    private int minutoLlegada;
    private String ps;
    private  int idPasajero;
    private String nombrePasajero;

    List<Bus> buseslist;
    List<Viaje> viajeslist;
    List<Pasajero>pasajeroList;

    public TerminalCentro(){
        buseslist = new ArrayList<>(List.of(
                new Bus("1", 1010,"Macarena",30),
                new Bus("2", 1011,"Macarena",15),
                new Bus("3", 2010,"TransHuila",30),
                new Bus("4", 2011,"Transhuila",15),
                new Bus("5", 3010,"CootransFusa",30),
                new Bus("6", 3011,"CootransFusa",15),
                new Bus("7", 4010,"Llanos",30),
                new Bus("8", 4011,"Llanos",15),
                new Bus("9", 5010,"Autocar",30),
                new Bus("10", 5011,"Autocar",15)
        ));

        viajeslist =  new ArrayList<>(List.of(
                new Viaje("1", "Bogota", LocalTime.of(8,30),LocalTime.of(9,30)),
                new Viaje("2", "Bogota", LocalTime.of(14,00),LocalTime.of(15,00)),
                new Viaje("3", "Medellin", LocalTime.of(9,30),LocalTime.of(12,30)),
                new Viaje("4", "Medellin", LocalTime.of(14,00),LocalTime.of(17,00)),
                new Viaje("5", "Cali", LocalTime.of(6,00),LocalTime.of(9,30)),
                new Viaje("6", "Cali", LocalTime.of(13,00),LocalTime.of(16,30))
                ));

        pasajeroList = new ArrayList<>(List.of(
                new Pasajero("1", 1069752138,"Pedro Torres"),
                new Pasajero("2", 10507356,"David Suarez"),
                new Pasajero("3", 20996812,"Luisa Perez"),
                new Pasajero("4", 1069752138,"Hernan Cortes"),
                new Pasajero("5", 1069752138,"Fernanda Fuentes")
        ));
    }
    public void registrarNuevoBus(Bus bus){
        buseslist = new ArrayList<>(List.of( new Bus(UUID.randomUUID().toString(), idBus,nombreEmpresa,capacidadBus)));
    }
    public void registrarNuevoViaje(Viaje viaje){
        viajeslist = new ArrayList<>(List.of( new Viaje(UUID.randomUUID().toString(), destinoViaje,LocalTime.of(horaSalida,minutoSalida),LocalTime.of(horaLlegada,minutoLlegada))));
    }
    public void registrarNuevoPasajero(Pasajero pasajero){
        pasajeroList = new ArrayList<>(List.of( new Pasajero(UUID.randomUUID().toString(), idPasajero,nombrePasajero)));
    }
    public void cargarBuses(Bus bus){
       buseslist.add(bus);
    }
    public void cargarViaje(Viaje viaje){
        viajeslist.add(viaje);
    }
    public void cargarPasajero(Pasajero pasajero){
        pasajeroList.add(pasajero);
    }

    public List<Bus> getBuseslist() {
        return buseslist;
    }

    public List<Viaje> getViajeslist() {
        return viajeslist;
    }

    public void setBuseslist(List<Bus> buseslist) {
        this.buseslist = buseslist;
    }

    public void setViajeslist(List<Viaje> viajeslist) {
        this.viajeslist = viajeslist;
    }

    public List<Pasajero> getPasajeroList() {
        return pasajeroList;
    }

    public void setPasajeroList(List<Pasajero> pasajeroList) {
        this.pasajeroList = pasajeroList;
    }

}

