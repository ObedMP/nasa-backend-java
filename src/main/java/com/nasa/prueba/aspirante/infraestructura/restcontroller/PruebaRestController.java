package com.nasa.prueba.aspirante.infraestructura.restcontroller;

import com.nasa.prueba.aspirante.dominio.dto.nasatestDTO;
import com.nasa.prueba.aspirante.dominio.entities.nasatestEntity;
import com.nasa.prueba.aspirante.infraestructura.repository.PruebaInterfaz;
import com.nasa.prueba.aspirante.service.nasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nasa-data")
public class PruebaRestController {
    PruebaInterfaz pruebaInterfaz;
    @Autowired
    private nasaService nasaservice;

   /* @GetMapping("/consume")
    public Iterable<nasatestEntity> getAllData(){
        return pruebaInterfaz.findAll();
    } */

    @GetMapping
    public List<nasatestDTO> fetchNasaData(){
        return nasaservice.fetchNasaData();
    }
}
