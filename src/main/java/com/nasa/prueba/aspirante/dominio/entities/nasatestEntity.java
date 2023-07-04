package com.nasa.prueba.aspirante.dominio.entities;

import javax.persistence.*;
import java.sql.Date;

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
    private Date date;

    public nasatestEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNasaId() {
        return nasaId;
    }

    public void setNasaId(String nasaId) {
        this.nasaId = nasaId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
