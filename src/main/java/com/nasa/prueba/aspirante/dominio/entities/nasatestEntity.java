package com.nasa.prueba.aspirante.dominio.entities;

import javax.persistence.*;

@Entity
@Table(name = "nasatest")
public class nasatestEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "href")
    private String href;

    @Column(name = "center")
    private String center;
    @Column(name = "title")
    private String title;
    @Column(name = "nasa_id")
    private String nasaId;
    @Column(name = "date")
    private String date;

    public nasatestEntity() {
    }

}
