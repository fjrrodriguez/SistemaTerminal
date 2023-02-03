package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.models.Bus;
import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;

import java.util.List;

public interface IBusesService {
    List<Bus> busesTotal();
    Bus cargarBusTerminal(Bus bus);

}
