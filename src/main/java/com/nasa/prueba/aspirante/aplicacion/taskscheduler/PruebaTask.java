package com.nasa.prueba.aspirante.aplicacion.taskscheduler;
import com.nasa.prueba.aspirante.dominio.dto.nasatestDTO;
import com.nasa.prueba.aspirante.dominio.entities.nasatestEntity;
import com.nasa.prueba.aspirante.infraestructura.clientrest.pruebanasaRest;
import com.nasa.prueba.aspirante.infraestructura.repository.PruebaInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class PruebaTask {
    /*Inicio de pruebas*/

    private pruebanasaRest pruebanasaRest;
    private PruebaInterfaz pruebaInterfaz;

    @Autowired
    public PruebaTask(PruebaInterfaz pruebaInterfaz){
        this.pruebanasaRest=new pruebanasaRest();
        this.pruebaInterfaz= pruebaInterfaz;
    }



    @Scheduled(fixedRate = 60000)
    public void fetchDataFormNasaApi(){
        nasatestDTO nasadata= pruebanasaRest.fetchData();
        nasatestEntity nasatestEntity =convertToEntity(nasadata);
        pruebaInterfaz.save(nasatestEntity);
    }
    private nasatestEntity convertToEntity(nasatestDTO nasatestDTO) {
        nasatestEntity nasaData = new nasatestEntity();
        nasaData.setHref(nasatestDTO.getHref());
        nasaData.setCenter(nasatestDTO.getCenter());
        nasaData.setTitle(nasatestDTO.getTitle());
        nasaData.setNasaId(nasatestDTO.getNasaId());
        nasaData.setDate( nasatestDTO.getDate());
        return nasaData;
    }
}
