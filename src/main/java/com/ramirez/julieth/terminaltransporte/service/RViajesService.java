package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.TerminalCentro;
import com.ramirez.julieth.terminaltransporte.repository.ViajesRepository;

import com.ramirez.julieth.terminaltransporte.repository.models.Destino;
import com.ramirez.julieth.terminaltransporte.repository.models.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class RViajesService implements IRViajesService{
@Autowired
private ViajesRepository viajesRepository;
@Autowired
private TerminalCentro terminalCentro;

    @Override
    public List<Viaje> registrarViajes(List<Viaje> viajesRegistrados) {
        return terminalCentro.getViajeList();
    }

    @Override
    public void obtenerViajes(List<Viaje> viajeList) {
        Viaje viaje1 = new Viaje(UUID.randomUUID().toString());
        viajeList.stream().forEach(viajes -> {
            terminalCentro.cargarViaje(viajes.getIdViaje());
        });
        viajesRepository.registrarViaje(viaje1);
    }
}
