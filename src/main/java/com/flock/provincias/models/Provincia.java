package com.flock.provincias.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Provincia {

    private String nombre;

    private Long id;

    private Centroide centroide;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Centroide getCentroide() {
        return centroide;
    }

    public void setCentroide(Centroide centroide) {
        this.centroide = centroide;
    }
}