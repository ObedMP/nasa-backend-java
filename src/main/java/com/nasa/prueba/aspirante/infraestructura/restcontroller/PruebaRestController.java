package com.nasa.prueba.aspirante.infraestructura.restcontroller;

import com.nasa.prueba.aspirante.dominio.entities.nasatestEntity;
import com.nasa.prueba.aspirante.infraestructura.repository.PruebaInterfaz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nasa-data")
public class PruebaRestController {
    PruebaInterfaz pruebaInterfaz;

    @GetMapping
    public Iterable<nasatestEntity> getAllData(){
        return pruebaInterfaz.findAll();
    }
}
