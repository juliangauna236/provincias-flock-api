package com.flock.provincias.testbuilders;

import com.flock.provincias.models.Centroide;
import lombok.Builder;

import com.flock.provincias.models.Provincia;

public class ProvinciaTestBuilder {

    @Builder
    public static Provincia provincia(String nombre, Long id, Centroide centroide){
        Provincia provincia = new Provincia();
        provincia.setNombre(nombre);
        provincia.setId(id);
        provincia.setCentroide(centroide);
        return  provincia;
    }

    public static class ProvinciaBuilder {
        private String nombre = "San Luis";
        private Long Id = Long.valueOf(74);
        private Centroide centroide = CentroideTestBuilder.builder().build();
    }
}
