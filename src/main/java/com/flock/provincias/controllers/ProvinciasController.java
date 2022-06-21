package com.flock.provincias.controllers;

import com.flock.provincias.models.Resultado;
import com.flock.provincias.services.ProvinciasConsumerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Api("Provincias")
public class ProvinciasController {

    @Autowired
    private ProvinciasConsumerService provinciasConsumerService;

    @ApiOperation(value = "Lista de Provincias", notes = "Información de todas las provincias")
    @GetMapping(value = "/provincias")
    public Resultado createAuthenticationToken() throws Exception {
        return provinciasConsumerService.getProvincias();
    }
}
