package com.sachin.lenshub.model;

// Created by sachin singh on 20/7/18.

public class Data {

    private Long id;
    private String title;
    private String price;
    private String thumbnail;
    private Boolean isSection;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Boolean getSection() {
        return isSection;
    }

    public void setSection(Boolean section) {
        isSection = section;
    }
}
