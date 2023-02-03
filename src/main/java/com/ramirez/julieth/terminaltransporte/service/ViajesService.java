package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.TerminalCentro;
import com.ramirez.julieth.terminaltransporte.repository.models.Bus;
import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;
import com.ramirez.julieth.terminaltransporte.repository.models.Viaje;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class ViajesService implements IViajesService{
    @Autowired
    TerminalCentro terminalCentro;
    @Override
    public List<Viaje> todosLosViajes() {
        return terminalCentro.getViajeslist();
    }

    @Override
    public Viaje cargarViaje(Viaje viaje) {
        Viaje viajeSel = new Viaje(UUID.randomUUID().toString(),
                viaje.getDestino(),
                viaje.getHora_llegada(),
                viaje.getHora_salida());
        return viajeSel;
    }
}
