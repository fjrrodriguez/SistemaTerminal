package com.ramirez.julieth.terminaltransporte.controller;

import com.ramirez.julieth.terminaltransporte.repository.models.Destino;
import com.ramirez.julieth.terminaltransporte.service.IDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/rest/dest")
public class DestinoController {
 @Autowired
    private IDestinoService DestinoService;

    @GetMapping("/bring/all")
    public ResponseEntity GETtraerDestinos(){

        return new ResponseEntity(DestinoService.todosLosDestinos() , HttpStatus.FOUND);
    }

    @PostMapping("/saveDestino")
    public ResponseEntity listaDestinos(@RequestBody Destino destino) {
        return new ResponseEntity(DestinoService.cargarDestino(destino), HttpStatus.CREATED);
    }
}
