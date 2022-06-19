package com.flock.provincias.services;

import com.flock.provincias.models.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProvinciasConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    public Resultado getProvincias(){
        return restTemplate.getForObject("https://apis.datos.gob.ar/georef/api/provincias", Resultado.class);
    }
}
