package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;
import java.util.List;
public interface IPasajeroService {
    List<Pasajero> pasajerosTerminal();

    Pasajero cargarPasajerosTerminal(Pasajero pasajero);

}
