package com.nasa.prueba.aspirante.service;

import com.nasa.prueba.aspirante.dominio.dto.nasaItems;
import com.nasa.prueba.aspirante.dominio.dto.nasatestDTO;
import com.nasa.prueba.aspirante.dominio.entities.nasatestEntity;
import com.nasa.prueba.aspirante.infraestructura.repository.PruebaInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class nasaService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PruebaInterfaz pruebaInterfaz;

    public void consumeAndSaveNasaData(){
        String url="https://images-api.nasa.gov";
        nasatestDTO response = restTemplate.getForObject(url, nasatestDTO.class);

        for(nasaItems item:response.getItems()){
            nasatestEntity nasadata=new nasatestEntity();
            nasadata.setHref(item.getHref());
            nasadata.setCenter(item.getCenter());
            nasadata.setTitle(item.getTitle());
            nasadata.setNasaId(item.getNasaId());
            nasadata.setDate(item.getDate());

            pruebaInterfaz.save(nasadata);

        }
    }
    public List<nasatestDTO> fetchNasaData(){
        List<nasatestEntity> nasaDataList = pruebaInterfaz.findAll();
        List<nasatestDTO> nasaDataDtoList = new ArrayList<>();

        for (nasatestEntity nasaData : nasaDataList) {
            nasatestDTO nasaDataDto = new nasatestDTO();
            nasaDataDto.setHref(nasaData.getHref());
            nasaDataDto.setCenter(nasaData.getCenter());
            nasaDataDto.setTitle(nasaData.getTitle());
            nasaDataDto.setNasaId(nasaData.getNasaId());
            nasaDataDto.setDate(nasaData.getDate());

            nasaDataDtoList.add(nasaDataDto);
        }

        return nasaDataDtoList;
    }
}
