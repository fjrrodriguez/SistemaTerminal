package com.ramirez.julieth.terminaltransporte.service;

import com.ramirez.julieth.terminaltransporte.repository.TerminalCentro;
import com.ramirez.julieth.terminaltransporte.repository.models.Destino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class DestinoService implements IDestinoService {
    @Autowired
    TerminalCentro terminalCentro;
    @Override
    public List<Destino> todosLosDestinos() {
        return terminalCentro.getDestinoList();
    }

    @Override
    public Destino cargarDestino(Destino destino) {
        Destino destinoSel = new Destino(UUID.randomUUID().toString(),
                destino.getIdDestino(),
                destino.getDestino(),
                destino.getHora_llegada(),
                destino.getHora_salida());
        return destinoSel;
    }
}
