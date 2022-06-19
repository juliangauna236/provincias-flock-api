package com.flock.provincias.controllers;

import com.flock.provincias.models.Resultado;
import com.flock.provincias.services.ProvinciasConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ProvinciasController {

    @Autowired
    private ProvinciasConsumerService provinciasConsumerService;

    @RequestMapping(value = "/provincias", method = RequestMethod.GET)
    public Resultado createAuthenticationToken() throws Exception {
        return provinciasConsumerService.getProvincias();
    }
}
