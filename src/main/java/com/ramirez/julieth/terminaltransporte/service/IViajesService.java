package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.models.Bus;
import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;
import com.ramirez.julieth.terminaltransporte.repository.models.Viaje;

import java.util.List;

public interface IViajesService {
    List<Viaje> todosLosViajes();
    Viaje cargarViaje(Viaje viaje);

}
