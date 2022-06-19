package com.flock.provincias.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Resultado {

    private Provincia[] provincias;

    private Integer cantidad;

    private Integer total;

    private Integer inicio;

    public Provincia[] getProvincias() {
        return provincias;
    }

    public void setProvincias(Provincia[] provincias) {
        this.provincias = provincias;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getInicio() {
        return inicio;
    }

    public void setInicio(Integer inicio) {
        this.inicio = inicio;
    }
}
