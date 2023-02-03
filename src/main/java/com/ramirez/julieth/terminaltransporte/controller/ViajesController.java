package com.ramirez.julieth.terminaltransporte.controller;

import com.ramirez.julieth.terminaltransporte.service.IRViajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/rest/via")
public class ViajesController {

    @Autowired
    private IRViajesService irViajesService;
}
