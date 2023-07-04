package com.nasa.prueba.aspirante.infraestructura.clientrest;

import com.nasa.prueba.aspirante.dominio.dto.nasatestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class pruebanasaRest {
    private static final String NASA_API_URL = "https://images-api.nasa.gov";

    private RestTemplate restTemplate;

    public pruebanasaRest() {
        this.restTemplate = new RestTemplate();
    }

    public nasatestDTO fetchData() {
        ResponseEntity<nasatestDTO> response = restTemplate.getForEntity(NASA_API_URL, nasatestDTO.class);
        return response.getBody();
    }
}
