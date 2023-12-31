package com.nasa.prueba.aspirante.dominio.dto;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class nasatestDTO {
    private List<nasaItems> items;
    private Long id;
    private String href;
    private String center;
    private String title;
    private String nasaId;
    private LocalDateTime date;

    public nasatestDTO() {
    }

    public nasatestDTO(Long id, String href, String center, String title, String nasaId, LocalDateTime date) {
        this.id = id;
        this.href = href;
        this.center = center;
        this.title = title;
        this.nasaId = nasaId;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<nasaItems> getItems() {
        return items;
    }

    public void setItems(List<nasaItems> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "nasatestDTO{" +
                "id=" + id +
                ", href='" + href + '\'' +
                ", center='" + center + '\'' +
                ", title='" + title + '\'' +
                ", nasaId='" + nasaId + '\'' +
                ", date=" + date +
                '}';
    }
}
