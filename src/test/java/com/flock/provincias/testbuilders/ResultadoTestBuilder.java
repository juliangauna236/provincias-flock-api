package com.flock.provincias.testbuilders;

import com.flock.provincias.models.Provincia;
import com.flock.provincias.models.Resultado;
import lombok.Builder;

import java.util.ArrayList;

public class ResultadoTestBuilder {

    @Builder
    public static Resultado resultado(Provincia[] provincias, Integer cantidad, Integer total, Integer inicio){
        Resultado resultado = new Resultado();
        resultado.setProvincias(provincias);
        resultado.setCantidad(cantidad);
        resultado.setTotal(total);
        resultado.setInicio(inicio);
        return resultado;
    }

    public static class ResultadoBuilder {
        private Provincia[] provincias = {ProvinciaTestBuilder.builder().build()};
        private Integer cantidad = 1;
        private Integer total = 1;
        private Integer inicio = 0;
    }
}
