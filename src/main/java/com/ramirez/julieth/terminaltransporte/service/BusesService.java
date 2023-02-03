package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.TerminalCentro;
import com.ramirez.julieth.terminaltransporte.repository.models.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class BusesService implements IBusesService{
    @Autowired
    TerminalCentro terminalCentro;
    @Override
    public List<Bus> busesTotal() {
        return terminalCentro.getBuseslist();
    }

    @Override
    public Bus cargarBusTerminal(Bus bus) {
        Bus busesTotal = new Bus(UUID.randomUUID().toString(),
                bus.getId(),
                bus.getEmpresa(),
                bus.getCapacidad());
        return busesTotal;
    }
}
