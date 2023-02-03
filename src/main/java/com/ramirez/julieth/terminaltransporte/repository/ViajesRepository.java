package com.ramirez.julieth.terminaltransporte.repository;


import com.ramirez.julieth.terminaltransporte.repository.models.Viaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ViajesRepository {
    private List<Viaje> viajes;

    public ViajesRepository(){
        this.viajes = new ArrayList<>();
    }
    public List<Viaje> obtenerViajes(){
        return this.viajes;
    }
    public void registrarViaje(Viaje viaje){
        viajes.add(viaje);
    }

}
