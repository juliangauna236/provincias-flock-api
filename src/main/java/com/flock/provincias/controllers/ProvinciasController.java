package com.flock.provincias.controllers;

import com.flock.provincias.models.Resultado;
import com.flock.provincias.services.ProvinciasConsumerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Api("Provincias")
public class ProvinciasController {

    private static final Logger logger = LogManager.getLogger(ProvinciasController.class);

    @Autowired
    private ProvinciasConsumerService provinciasConsumerService;

    @ApiOperation(value = "Lista de Provincias", notes = "Información de todas las provincias")
    @GetMapping(value = "/provincias")
    public Resultado createAuthenticationToken() throws Exception {
        logger.info("Nuevo request a ");
        return provinciasConsumerService.getProvincias();
    }
}
