package com.caiomatenorio.dslist.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game() {}

    public Game(Long id, String name, Integer year, String genre, Double score, String platforms, String imgUrl,
                String shortDescription, String longDescription) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.score = score;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Game game)) return false;
        return Objects.equals(id, game.id) &&
                Objects.equals(name, game.name) &&
                Objects.equals(year, game.year) &&
                Objects.equals(genre, game.genre) &&
                Objects.equals(platforms, game.platforms) &&
                Objects.equals(score, game.score) &&
                Objects.equals(imgUrl, game.imgUrl) &&
                Objects.equals(shortDescription, game.shortDescription) &&
                Objects.equals(longDescription, game.longDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year, genre, platforms, score, imgUrl, shortDescription, longDescription);
    }
}
