package com.nasa.prueba.aspirante.dominio.dto;


public class nasatestDTO {

    private int id;
    private String href;
    private String center;
    private String title;
    private String nasaId;
    private String date;

    public nasatestDTO() {
    }

    public nasatestDTO(int id, String href, String center, String title, String nasaId, String date) {
        this.id = id;
        this.href = href;
        this.center = center;
        this.title = title;
        this.nasaId = nasaId;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
