package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.ViajesRepository;
import com.ramirez.julieth.terminaltransporte.repository.models.Bus;
import com.ramirez.julieth.terminaltransporte.repository.models.Destino;
import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;
import com.ramirez.julieth.terminaltransporte.repository.models.Viaje;

import java.util.List;

public interface IRViajesService {

    void registrarViajes(List<Viaje> viajesRegistrados);
    List<Viaje> obtenerViajes();
}
