package com.ramirez.julieth.terminaltransporte.service;

import ch.qos.logback.classic.util.StatusViaSLF4JLoggerFactory;
import com.ramirez.julieth.terminaltransporte.repository.models.Viaje;

import java.util.List;

public interface IRViajesService {

    List<Viaje> registrarViajes(List<Viaje> viajesRegistrados);

    void obtenerViajes(List<Viaje> viajeList);
}
