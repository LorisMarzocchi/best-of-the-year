package org.lessons.bestoftheyear.model;

public class Movie {
    private String name;
    private String description;
    private int duration;
    private String urlImage;

    public Movie(String name, String description, int duration, String urlImage) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.urlImage = urlImage;
    }
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    // Getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
