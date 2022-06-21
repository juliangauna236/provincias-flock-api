package com.flock.provincias.testbuilders;

import com.flock.provincias.models.Centroide;
import lombok.Builder;

public class CentroideTestBuilder {

    @Builder
    private static Centroide centroide(Double lat, Double lon){
        Centroide centroide = new Centroide();
        centroide.setLat(lat);
        centroide.setLon(lon);
        return centroide;
    }

    public static class CentroideBuilder {
        private Double lat = -33.7577257449137;
        private Double lon = -66.0281298195836;
    }
}
