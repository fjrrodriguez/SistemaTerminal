package com.ramirez.julieth.terminaltransporte.controller;

import com.ramirez.julieth.terminaltransporte.repository.models.Bus;
import com.ramirez.julieth.terminaltransporte.service.IBusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/rest/bus")
public class BusesController {

    @Autowired
    private IBusesService busesService;

    @GetMapping("/bring/all")
    public ResponseEntity GETtraerBuses(){

        return new ResponseEntity(busesService.busesTotal() , HttpStatus.FOUND);
    }

    @PostMapping("/saveBus")
    public ResponseEntity listaBuses(@RequestBody Bus bus) {
        return new ResponseEntity(busesService.cargarBusTerminal(bus), HttpStatus.CREATED);
    }
}
