package com.ramirez.julieth.terminaltransporte.repository;

import com.ramirez.julieth.terminaltransporte.repository.models.Bus;
import com.ramirez.julieth.terminaltransporte.repository.models.Destino;
import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;
import com.ramirez.julieth.terminaltransporte.repository.models.Viaje;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;


@Repository
public class TerminalCentro {
    private String bs;
    private int idBus;
    private String nombreEmpresa;
    private int capacidadBus;
    private String vs;
    private int idDestino;
    private String destinoViaje;
    private int horaSalida;
    private int minutoSalida;
    private int horaLlegada;
    private int minutoLlegada;
    private String ps;
    private  int idPasajero;
    private String nombrePasajero;
    private int idViaje;

    List<Bus> buseslist;
    List<Destino> destinoList;
    List<Pasajero>pasajeroList;
    List<Viaje> viajeList;

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

        destinoList =  new ArrayList<>(List.of(
                new Destino("1", 1,"Bogota", LocalTime.of(8,30),LocalTime.of(9,30)),
                new Destino("2", 2,"Bogota", LocalTime.of(14,00),LocalTime.of(15,00)),
                new Destino("3", 3,"Medellin", LocalTime.of(9,30),LocalTime.of(12,30)),
                new Destino("4", 4, "Medellin", LocalTime.of(14,00),LocalTime.of(17,00)),
                new Destino("5", 5, "Cali", LocalTime.of(6,00),LocalTime.of(9,30)),
                new Destino("6", 6, "Cali", LocalTime.of(13,00),LocalTime.of(16,30))
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
    public void registrarNuevoDestino(Destino destino){
        destinoList = new ArrayList<>(List.of( new Destino(UUID.randomUUID().toString(), idDestino, destinoViaje,LocalTime.of(horaSalida,minutoSalida),LocalTime.of(horaLlegada,minutoLlegada))));
    }
    public void registrarNuevoPasajero(Pasajero pasajero){
        pasajeroList = new ArrayList<>(List.of( new Pasajero(UUID.randomUUID().toString(), idPasajero,nombrePasajero)));
    }
    public void registrarNuevoViaje(Viaje viaje){
        viajeList = new ArrayList<>(List.of(new Viaje(UUID.randomUUID().toString(), idViaje, (Bus) busOcupado(bs),pasajeroList, (Destino) miDestino(vs))));
    }
    public void cargarBuses(Bus bus){
       buseslist.add(bus);
    }
    public void cargarDestino(Destino destino){
        destinoList.add(destino);
    }
    public void cargarPasajero(Pasajero pasajero){
        pasajeroList.add(pasajero);
    }
    public void cargarViaje(Viaje viaje){
        viajeList.add(viaje);
    }

    public List<Viaje> getViajeList() {
        return viajeList;
    }

    public void setViajeList(List<Viaje> viajeList) {
        this.viajeList = viajeList;
    }

    public List<Bus> getBuseslist() {
        return buseslist;
    }

    public List<Destino> getDestinoList() {
        return destinoList;
    }

    public void setBuseslist(List<Bus> buseslist) {
        this.buseslist = buseslist;
    }

    public void setDestinoList(List<Destino> destinoList) {
        this.destinoList = destinoList;
    }

    public List<Pasajero> getPasajeroList() {
        return pasajeroList;
    }

    public void setPasajeroList(List<Pasajero> pasajeroList) {
        this.pasajeroList = pasajeroList;
    }


    /**
     * public void subirPasajeroBus(Pasajero pasajero, String bs) {
     *         List<Bus> subir = buseslist.stream().map(buspas -> {
     *             if(buspas.getBs().equals(bs)){
     *                 buspas.subirPasajeroBus(pasajero);
     *                 return buspas;
     *             }
     *             return buspas;
     *         }).collect(Collectors.toList());
     *     }
     *
     *
     *
     * public void obtenerDestino(String vs, String bs){
     *         List<Destino> miDestino = destinoList.stream().
     *                 filter(dest ->dest.equals(vs)).collect(Collectors.toList());
     *         List<Bus> busDestino = buseslist.stream().map(busdest ->{
     *             if(busdest.getBs().equals(bs)){
     *                 busdest.agregarDestino(miDestino);
     *                 return busdest;
     *             }
     *             return busdest;
     *         }).collect(Collectors.toList());
     *
     *     }
     *
     */

    public List<Bus> busOcupado(String bs) {
        List<Bus> busOcupado = buseslist.stream().filter(bus -> bus.getBs().equals(bs)).collect(Collectors.toList());
        return busOcupado;
    }
    public List<Destino> miDestino(String vs){
        List<Destino> miDestino = destinoList.stream().filter(destino -> destino.getVs().equals(vs)).collect(Collectors.toList());
        return miDestino;
    }

    public void iniciarViaje(List<Bus> busOcupado, List<Destino> miDestino){

    }
}

