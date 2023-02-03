package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.TerminalCentro;
import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PsajerosService implements IPasajeroService{
    @Autowired
    TerminalCentro terminalCentro;
    @Override
    public List<Pasajero> pasajerosTerminal() {
        return terminalCentro.getPasajeroList();
    }

    @Override
    public Pasajero cargarPasajerosTerminal(Pasajero pasajero) {
        Pasajero pasajerosTotal = new Pasajero(UUID.randomUUID().toString(),
                pasajero.getCedula(),
                pasajero.getNombre());
        return pasajerosTotal;
    }
}
