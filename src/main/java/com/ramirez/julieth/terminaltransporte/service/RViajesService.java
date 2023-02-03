package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.TerminalCentro;
import com.ramirez.julieth.terminaltransporte.repository.ViajesRepository;

import com.ramirez.julieth.terminaltransporte.repository.models.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class RViajesService implements IRViajesService{
@Autowired
private ViajesRepository viajesRepository;
@Autowired
private TerminalCentro terminalCentro;

    @Override
    public void registrarViajes(List<Viaje> viajesRegistrados) {

    }

    @Override
    public List<Viaje> obtenerViajes() {
        return null;
    }
}
