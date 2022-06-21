package com.flock.provincias.services;

import com.flock.provincias.models.Resultado;
import com.flock.provincias.testbuilders.ResultadoTestBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

@ExtendWith(MockitoExtension.class)
public class ProvinciasServiceTest {

    @InjectMocks
    private ProvinciasConsumerService service;

    @Mock
    private RestTemplate restTemplate;

    @Test
    void getAllProvincias(){
        Resultado resultado = ResultadoTestBuilder.builder().build();
        Mockito.when(restTemplate.getForObject("https://apis.datos.gob.ar/georef/api/provincias", Resultado.class))
                .thenReturn(resultado);
        service.getProvincias();

        Mockito.verify(restTemplate).getForObject("https://apis.datos.gob.ar/georef/api/provincias", Resultado.class);
    }
}
