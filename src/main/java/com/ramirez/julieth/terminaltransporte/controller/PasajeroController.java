package com.ramirez.julieth.terminaltransporte.controller;

import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;
import com.ramirez.julieth.terminaltransporte.service.IPasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pasajer")
public class PasajeroController {

    @Autowired
    private IPasajeroService pasajeroService;

    @GetMapping("/bring/all")
    public ResponseEntity GETtraerPasajero(){

        return new ResponseEntity(pasajeroService.pasajerosTerminal() , HttpStatus.FOUND);
    }

    @PostMapping("/saveProduc")
    public ResponseEntity listaPasajero(@RequestBody Pasajero pasajero) {
        return new ResponseEntity(pasajeroService.cargarPasajerosTerminal(pasajero), HttpStatus.CREATED);
    }
}
