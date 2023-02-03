package com.ramirez.julieth.terminaltransporte.controller;

import com.ramirez.julieth.terminaltransporte.repository.models.Pasajero;
import com.ramirez.julieth.terminaltransporte.service.IPasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pas")
public class PasajeroController {

    @Autowired
    private IPasajeroService pasajeroService;

    @GetMapping("/bring/all")
    public ResponseEntity GETtraerPasajero(){

        return new ResponseEntity(pasajeroService.pasajerosTerminal() , HttpStatus.FOUND);
    }

    @PostMapping("/savePasajer")
    public ResponseEntity agragarpasajero(@RequestBody Pasajero pasajero) {
        pasajeroService.cargarPasajerosTerminal(pasajero);
        return new ResponseEntity(pasajero,HttpStatus.ACCEPTED);
    }
}
