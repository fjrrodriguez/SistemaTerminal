package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.models.Destino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IDestinoService {

    List<Destino> todosLosDestinos();

    Destino cargarDestino(Destino destino);

}
