package com.nasa.prueba.aspirante.aplicacion.taskscheduler;
import com.nasa.prueba.aspirante.dominio.dto.nasatestDTO;
import com.nasa.prueba.aspirante.infraestructura.clientrest.pruebanasaRest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PruebaTask {
    /*Inicio de pruebas*/

    private pruebanasaRest pruebanasaRest;

    /* INYECTAR EL REPOSITORY*/

    public PruebaTask(){
        this.pruebanasaRest=new pruebanasaRest();
    }
    @Scheduled(fixedRate = 60000)
    public void fetchDataFormNasaApi(){
        nasatestDTO nasadata= pruebanasaRest.fetchData();
    }
}
